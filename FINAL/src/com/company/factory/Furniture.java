package com.company.factory;

public interface Furniture {
    String isEnable();

    void setEnable(boolean bool);

    String getSize();

    void setSize(String size);

    String getStyle();

    void setStyle(String style);

    double getCost();

    void setCost(double cost);
}
