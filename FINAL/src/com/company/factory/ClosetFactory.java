package com.company.factory;

public class ClosetFactory implements Factory{
    @Override
    public Furniture createFurniture(boolean enable, String style, double cost) {
        return new Closet(enable, style, cost);
    }
}
