package com.company.adapter;

import java.util.Scanner;

public class CashPayment{
    private double amount;
    public CashPayment(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public double getCash(){
        double result;
        result = this.amount;
        return result;
    }
}
