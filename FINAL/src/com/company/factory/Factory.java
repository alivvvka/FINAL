package com.company.factory;

public interface Factory {
    Furniture createFurniture(boolean enable, String style, double cost);
}
