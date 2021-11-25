package com.company.facade;

import com.company.adapter.CashPayment;
import com.company.adapter.CashPaymentAdapter;
import com.company.decorator.*;
import com.company.factory.*;
import com.company.observer.Bot;
import com.company.observer.FurnitureNotifyManager;
import com.company.observer.Observer;
import com.company.strategy.CardPayment;
import com.company.strategy.Payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Facade {
    private List<Furniture> cart = new ArrayList<>();
    private double total = 0;
    private FurnitureNotifyManager manager;
    private  Observer bot = new Bot();

    public Facade(FurnitureNotifyManager manager) {
        this.manager = manager;
    }

    public void buyFurniture(){
        int i = 1;
        for (Furniture fur: manager.getFurs()){
            System.out.println(i + ". " + fur.toString());
            i++;
        }
        i = 1;
        System.out.println("Select furniture by writing number:");

        while (true) {
            System.out.println("0 - exit");
            System.out.println("-1 - buy");
            System.out.println("-2 - show cart\n");
            System.out.println("******************************************************");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            if (option == 0) {
                System.out.println("Furniture: ");
                for (Furniture fur:cart){
                    manager.returnFurniture(fur);
                }
                cart.clear();
                break;
            } else if (option == -1){
                System.out.println("Select payment type: ");
                System.out.println("1 - Card(online)");
                System.out.println("2 - Cash(offline + commission 10%)");
                System.out.println("0 - exit\n");

                option = scanner.nextInt();
                if (option == 1){
                    Payment card = new CardPayment();

                    card.collectPaymentDetails();
                    card.pay(total);
                    System.out.println("******************************************************");
                    this.total = 0;
                } else if (option == 2){
                    CashPayment cashPayment = new CashPayment(total);
                    Payment cash = new CashPaymentAdapter(cashPayment);

                    cash.collectPaymentDetails();
                    cash.pay(cashPayment.getAmount());
                    System.out.println("******************************************************");
                    this.total = 0;
                } else if (option == 0){
                    break;
                }
                break;
            } else if (option == -2){
                if (cart.isEmpty()){
                    System.out.println("Cart is empty!");
                    break;
                } else {
                    for (Furniture fur : cart) {
                        System.out.println(fur.toString());
                    }
                    continue;
                }
            }

            cart.add(manager.getFurs().get(option - 1));
            total += manager.getFurs().get(option - 1).getCost();

            manager.removeFurniture(manager.getFurs().get(option - 1));

            for (Furniture fur: manager.getFurs()){
                System.out.println(i + ". " + fur.toString());
                i++;
            }
            i = 1;
            System.out.println("Total price - " + total + "$");
        }
    }

    public Furniture createAndNotify(boolean enable, String style, double cost, int type){

        if (!manager.getSubs().contains(bot)){
            manager.registerSub(bot);
        }


        if (type == 1){
            Factory chairFactory = new ChairFactory();
            Furniture chair = chairFactory.createFurniture(enable, style, cost);

            manager.addFurniture(chair);
            return chair;
        } else if(type == 2){
            Factory tableFactory = new TableFactory();
            Furniture table = tableFactory.createFurniture(enable, style, cost);

            manager.addFurniture(table);
            return table;
        } else if(type == 3){
            Factory closetFactory = new ClosetFactory();
            Furniture closet = closetFactory.createFurniture(enable, style, cost);

            manager.addFurniture(closet);
            return closet;
        } else{
            System.out.println("!!!WRONG TYPE!!!");
            return null;
        }
    }

    public void delivery(Delivery dec){
        dec.collectAddress();
        dec.delivery();
        dec.output();
    }


}
