package com.company.Observer;

import com.company.FurnitureFactory.Furniture;

import java.util.ArrayList;
import java.util.List;

public class Bot implements Observer{
    private List<Furniture> furs = new ArrayList<>();

    @Override
    public void update(List<Furniture> furs) {
        this.furs = furs;
        System.out.println("Some changes in store! Check it :");
        for (Furniture fur:this.furs) {
            System.out.println(fur.toString());
        }
    }

}
