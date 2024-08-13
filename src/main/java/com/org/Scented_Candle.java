package com.org;

public class Scented_Candle extends Candle {
    //ST10434048
    protected String scent;

    public void setScent(String scent) {
        this.scent = scent;
    }

    protected String getScent() {
        return scent;
    }

//ST10442063
    @Override
    public void Price(int height) {
        double Price = height * 3;
    }
}
