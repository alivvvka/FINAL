package com.company.decorator;

import java.util.Scanner;

public abstract class DeliveryDecorator implements Delivery{
    protected Delivery deliverytype;
    private String City;
    private String Street;
    private String Apartment;
    public DeliveryDecorator(Delivery deliverytype){
        this.deliverytype = deliverytype;
    }

    @Override
    public void delivery() {
        deliverytype.delivery();
    }

    @Override
    public void collectAddress() {

    }

    @Override
    public void output() {

    }
}
