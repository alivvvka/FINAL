package com.company.factory;

public class TableFactory implements Factory{
    @Override
    public Furniture createFurniture(boolean enable, String style, double cost) {
        return new Table(enable, style, cost);
    }
}
