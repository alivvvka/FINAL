package com.company.FurnitureFactory;

public class Chair implements Furniture{
    private boolean enable;
    private String size = "Small";
    private String style;
    private double cost;

    public Chair(boolean enable, String style, double cost) {
        this.enable = enable;
        this.style = style;
        this.cost = cost;
    }

    @Override
    public String isEnable() {
        return this.enable ? "Yeah" : "No";
    }

    @Override
    public void setEnable(boolean bool) {
        this.enable = bool;
    }

    @Override
    public String getSize() {
        return this.size;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getStyle() {
        return this.style;
    }

    @Override
    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Chair, size - " + size  + ", style - " + style +  ", cost - " + cost + "$";
    }
}
