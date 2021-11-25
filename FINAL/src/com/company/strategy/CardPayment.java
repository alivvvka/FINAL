package com.company.strategy;
import com.company.strategy.CreditCard;
import com.company.strategy.Payment;

import java.util.Scanner;
public class CardPayment implements Payment {

    private CreditCard creditCard;
    private String number;
    private String date;
    private String cvv;

    @Override
    public boolean pay(double paymentamount) {
        System.out.println("Paying " + paymentamount + " using Credit Card");
        return true;
    }

    @Override
    public void collectPaymentDetails() {
        Scanner cin = new Scanner(System.in);
        System.out.println("Card number: ");
        this.number = cin.next();
        System.out.println("Enter the card expiration date 'mm/yy':");
        this.date = cin.next();
        System.out.println("Enter the CVV code:");
        this.cvv = cin.next();
        creditCard = new CreditCard(number,date,cvv);


    }
}
