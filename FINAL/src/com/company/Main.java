package com.company;

import com.company.decorator.*;
import com.company.facade.Facade;
import com.company.factory.*;
import com.company.observer.Bot;
import com.company.observer.FurnitureNotifyManager;
import com.company.observer.Observer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final FurnitureNotifyManager manager = new FurnitureNotifyManager();
    private static final Facade facade = new Facade(manager);

    public static void main(String[] args) {

        List<Furniture> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println();
            System.out.println("Welcome to 'A.B.A' Furniture Shop");
            System.out.println("Select option:");
            System.out.println("1. Login as admin");
            System.out.println("2. Add furniture into the cart");
            System.out.println("3. Delivery");
            System.out.println("0. Exit\n");

            try {
                System.out.print("Enter option (0-4): \n");
                int option = scanner.nextInt();
                System.out.println("******************************************************");
                if (option == 1) {
                    System.out.println("Select option:");
                    System.out.println("1. Create furniture (with notifying)");
                    System.out.println("2. Check furniture list");
                    System.out.println("3. Remove furniture\n");
                    System.out.print("Enter option (0-3): \n");

                    option = scanner.nextInt();
                    if (option == 1){
                        System.out.println("******************************************************");
                        System.out.println("Select option:");
                        System.out.println("1. Chair");
                        System.out.println("2. Table");
                        System.out.println("3. Closet\n");
                        System.out.print("Enter option (0-3): \n");

                        option = scanner.nextInt();
                        System.out.println("******************************************************");
                        if (option == 1){
                            System.out.println("Write style");
                            String style = scanner.next();
                            System.out.println("Write cost");
                            double cost = scanner.nextDouble();
                            facade.createAndNotify(true,style, cost, 1);
                            System.out.println("Chair was created!");
                            System.out.println("******************************************************");
                            continue;
                        } else if (option == 2){
                            System.out.println("Write style");
                            String style = scanner.next();
                            System.out.println("Write cost");
                            double cost = scanner.nextDouble();
                            facade.createAndNotify(true,style, cost, 2);
                            System.out.println("Table was created!");
                            System.out.println("******************************************************");
                            continue;
                        } else if (option == 3){
                            System.out.println("Write style");
                            String style = scanner.next();
                            System.out.println("Write cost");
                            double cost = scanner.nextDouble();
                            facade.createAndNotify(true,style, cost, 3);
                            System.out.println("Closet was created!");
                            System.out.println("******************************************************");
                            continue;
                        }
                    } else if(option == 2){
                        for (Furniture fur: manager.getFurs()){
                            System.out.println(fur.toString());
                        }
                    } else if(option == 3){
                        int i = 1;
                        while (true) {
                            for (Furniture fur : manager.getFurs()) {
                                System.out.println(i + ". " + fur.toString());
                                i++;
                            }
                            i = 1;

                            System.out.println("Remove by number(0 - exit)");
                            option = scanner.nextInt();
                            if (option == 0){
                                break;
                            }
                            manager.removeFurniture(manager.getFurs().get(option - 1));
                        }
                    }
                } else if (option == 2) {
                    facade.buyFurniture();
                    System.out.println("******************************************************");

                    continue;
                } else if (option == 3) {
                    System.out.println("");
                    System.out.println("Select delivery option:");
                    System.out.println("1. Mover");
                    System.out.println("2. Mover + Truck");
                    System.out.println("3. Mover + Truck + Ship");
                    System.out.println("4. Mover + Truck + Ship + Rocket");
                    System.out.println("0. Exit");
                    System.out.print("Enter option (0-4): \n");

                    Delivery dec = null;
                    option = scanner.nextInt();
                    if (option == 1){
                        dec = new FurnitureMen();
                    } else if (option == 2){
                        dec = new Truck(new FurnitureMen());
                    } else if (option == 3){
                        dec = new Truck(new Ship(new FurnitureMen()));
                    } else if (option == 4){
                        dec = new Truck(new Ship(new Rocket(new FurnitureMen())));
                    } else if(option == 0){
                        break;
                    }
                    facade.delivery(dec);
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("******************************************************");
        }
    }
}
