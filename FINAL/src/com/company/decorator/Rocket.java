package com.company.decorator;

import java.util.Scanner;

public class Rocket extends DeliveryDecorator{
    private String City;
    private String Street;
    private String Apartment;
    public Rocket(Delivery deliverytype){
        super(deliverytype);
    }
    @Override
    public void delivery() {
        deliverytype.delivery();
        addDelivery(deliverytype);
    }
    private void addDelivery(Delivery deliverytype)
    {
        System.out.println("On rocket");
    }
    @Override
    public void collectAddress() {
        Scanner cin = new Scanner(System.in);
        System.out.println("City: ");
        this.City = cin.next();
        System.out.println("Street:");
        this.Street = cin.next();
        System.out.println("Apartment:");
        this.Apartment = cin.next();
    }
    @Override
    public void output() {
        System.out.println("Delivery will be to address: "
                + this.City + ", " + this.Street + " Street" + " Flat: "+this.Apartment);
    }

}
