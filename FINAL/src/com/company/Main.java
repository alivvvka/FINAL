package com.company;

import com.company.factory.*;
import com.company.observer.Bot;
import com.company.observer.FurnitureNotifyManager;
import com.company.observer.Observer;

public class Main {
    private static final FurnitureNotifyManager manager = new FurnitureNotifyManager();
    private static final Observer bot = new Bot();

    public static Furniture createAndNotify(boolean enable, String style, double cost, int type){
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

    public static void main(String[] args) {

        createAndNotify(true,"Stol", 5000000, 1);
        Furniture rofl = createAndNotify(true,"dsadas", 123123, 3);

        manager.removeFurniture(rofl);





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
