package com.semaine3.lundi02;


public abstract class Media {
    private double price;
    private String title;
    private Publisher publisher;

    public Media( double price , String title , Publisher publisher ){
        this.price = price;
        this.title = title;
        this.publisher = publisher;
    }


    public double getNetPrice(){
        return price + (( price /100)* 20 );
    }

    public String toString(){
        return "Le media: "+title+" à un cout de: "+getNetPrice() +" et son editeur est: "+publisher.toString();
    }

    public double getPrice(){
        return price;
    }

    public String getTitle(){
        return title;
    }

}

