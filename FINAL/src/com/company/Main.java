package com.company;

import com.company.FurnitureFactory.Factory;
import com.company.FurnitureFactory.Furniture;
import com.company.FurnitureFactory.TableFactory;
import com.company.Observer.Bot;
import com.company.Observer.FurnitureNotifyManager;
import com.company.Observer.NotifyManager;
import com.company.Observer.Observer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public void create_notify(){

    }

    public static void main(String[] args) {

        Factory table = new TableFactory();
        FurnitureNotifyManager manager = new FurnitureNotifyManager();
        Observer bot = new Bot();

        manager.registerSub(bot);

        Furniture tab = table.createFurniture(true,"Stol", 5000000);
        manager.addFurniture(tab);

        Furniture tab2 = table.createFurniture(true, "Arys", 1234567);
        manager.addFurniture(tab2);





//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println();
//            System.out.println("Welcome to NecklaceShop");
//            System.out.println("Select option:");
//            System.out.println("1. Get all stones");
//            System.out.println("2. Get presious stones");
//            System.out.println("3. Get semipresious stones");
//            System.out.println("4. Get decorative stones");
//            System.out.println("5. Custom necklace");
//            System.out.println("6. Custom necklace");
//            System.out.println("0. Exit\n");
//
//            try {
//                System.out.print("Enter option (0-5): ");
//                int option = scanner.nextInt();
//                if (option == 1) {
//                    continue;
//                } else if (option == 2) {
//                    continue;
//                } else if (option == 3) {
//                    continue;
//                } else if (option == 4){
//                    continue;
//                } else if (option == 5){
//                    continue;
//                } else if (option == 6){
//                    continue;
//                } else {
//                    break;
//                }
//            } catch (InputMismatchException e) {
//                System.out.println("Input must be integer");
//                scanner.nextLine();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//
//            System.out.println("*************************");
//        }
    }
}
