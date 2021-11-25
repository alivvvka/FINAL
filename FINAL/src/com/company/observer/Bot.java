package com.company.observer;

import com.company.factory.Furniture;

import java.util.ArrayList;
import java.util.List;

public class Bot implements Observer{
    private List<Furniture> furs = new ArrayList<>();

    @Override
    public void update(List<Furniture> furs) {
        this.furs = furs;
        System.out.println("\n!!!Some changes in store! Check it :");
        for (Furniture fur:this.furs) {
            System.out.println(fur.toString());
        }
    }

}
