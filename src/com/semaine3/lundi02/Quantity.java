package com.semaine3.lundi02;

public class Quantity {
    Media media;
    int quantity;

    public Quantity(Media media){
        this.media = media;
        this.quantity = 1;
    }

    public void addQuantity(){
        quantity++;
    }
    public int getQuantity(){
        return quantity;
    }

    public Media getMedia(){
        return media;
    }

    public double getNetPrice(){
        return media.getNetPrice() * quantity;
    }
}
