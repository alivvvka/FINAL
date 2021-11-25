package com.company.decorator;

import java.util.Scanner;

public class FurnitureMen implements Delivery {
    private String City;
    private String Street;
    private String Apartment;

    @Override
    public void delivery() {
        System.out.println("Furniture Man will deliver");
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
