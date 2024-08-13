package com.org;

public class Candle {

    private String colour; //Matteo Declared Candle data fields
    protected double height;
    protected double price;

    public String getColour() { //Xavier declared getters and setters
        return colour;
    }

    public double getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void CandlePrice(double height) {//Matteo
        this.price = height * 2;
    }


}
