package com.company.FurnitureFactory;

public interface Factory {
    Furniture createFurniture(boolean enable, String style, double cost);
}
