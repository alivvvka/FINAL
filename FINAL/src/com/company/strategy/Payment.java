package com.company.strategy;

public interface Payment {
    boolean pay(double paymentamount);
    void collectPaymentDetails();
}
