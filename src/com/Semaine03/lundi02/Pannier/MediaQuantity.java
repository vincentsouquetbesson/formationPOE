package com.Semaine03.lundi02.Pannier;

public class MediaQuantity {
    IMedia media;
    int quantity;

    public MediaQuantity(IMedia media){
        this.media = media;
        this.quantity = 1;
    }

    public void addQuantity(){
        quantity++;
    }

    public void lessQuantity(){
        quantity--;
    }

    public IMedia getMedia(){
        return media;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getNetPrice(){
        return media.getNetPrice() * quantity;
    }
}
