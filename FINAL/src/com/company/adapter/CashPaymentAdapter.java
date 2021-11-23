package com.company.adapter;

import com.company.strategy.Payment;

import java.util.Scanner;

public class CashPaymentAdapter implements Payment {
    private CashPayment cashPayment;

    public CashPaymentAdapter(CashPayment cashPayment){
        this.cashPayment = cashPayment;
    }

    @Override
    public boolean pay(double paymentamount) {
        System.out.println("Paying " + cashPayment.getAmount()*1.1 + " using Cash");
        return true;
    }

    @Override
    public void collectPaymentDetails() {
        Scanner cin = new Scanner(System.in);
        System.out.println("Imya: ");
        String number = cin.next();
        System.out.println("Familia:");
        String date = cin.next();

    }
}
