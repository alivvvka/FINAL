package com.company.FurnitureFactory;

public class ChairFactory implements Factory{
    @Override
    public Furniture createFurniture(boolean enable, String style, double cost) {
        return new Chair(enable, style, cost);
    }
}
