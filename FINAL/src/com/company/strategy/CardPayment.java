package com.company.strategy;

import java.util.Scanner;
public class CardPayment implements Payment {

    private String number;
    private String date;
    private String cvv;

    @Override
    public void pay(double paymentamount) {
        System.out.println("Paying " + paymentamount + "$ using Credit Card");
    }

    @Override
    public void collectPaymentDetails() {
        Scanner cin = new Scanner(System.in);

        while(true) {
            System.out.println("Card number: ");
            this.number = cin.next();

            System.out.println("Enter the card expiration date 'mm/yy':");
            this.date = cin.next();
            String[] parts = this.date.split("/",2);

            System.out.println("Enter the CVV code:");
            this.cvv = cin.next();

            if(this.cvv.length()!=3) {
                System.out.println("Incorrect cvv!");
                continue;
            }
            if (this.number.length() != 16) {
                System.out.println("Incorrect card number!");
                continue;
            }
            if(Integer.parseInt(parts[0])>12 || Integer.parseInt(parts[0])<0 || Integer.parseInt(parts[1])<0 || Integer.parseInt(parts[1])>100) {
                System.out.println("Incorrect date!");
                continue;

            }

            break;
        }
    }
}
