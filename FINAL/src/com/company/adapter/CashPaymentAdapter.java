package com.company.adapter;

import com.company.strategy.Payment;

import java.util.Scanner;

public class CashPaymentAdapter implements Payment {
    private CashPayment cashPayment;


    public CashPaymentAdapter(CashPayment cashPayment){
        this.cashPayment = cashPayment;
    }

    @Override
    public void pay(double paymentamount) {
        System.out.println("Paying " + cashPayment.getAmount()*1.1 + " using Cash(commission - " + cashPayment.getAmount()*0.1 + ")");
    }

    @Override
    public void collectPaymentDetails() {
        Scanner cin = new Scanner(System.in);

        System.out.println("First name: ");
        String number = cin.next();

        System.out.println("Last name:");
        String date = cin.next();
    }
}
