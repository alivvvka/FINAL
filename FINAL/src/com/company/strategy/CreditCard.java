package com.company.strategy;

public class CreditCard {
    private String number;
    private String date;
    private String cvv;

    CreditCard(String number, String date, String cvv){
        this.number = number;
        this.cvv = cvv;
        this.date = date;
    }
}
