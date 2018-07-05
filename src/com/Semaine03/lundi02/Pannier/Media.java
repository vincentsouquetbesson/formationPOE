package com.Semaine03.lundi02.Pannier;


import java.io.Serializable;

public abstract class Media implements IMedia  {
    private double price;
    private String title;
    private Publisher publisher;

    public Media( double price , String title , Publisher publisher ){
        this.price = price;
        this.title = title;
        this.publisher = publisher;
    }


    @Override
    public double getNetPrice(){
        return price + (( price /100)* 20 );
    }

    @Override
    public String toString(){
        return "Le media: "+title+" à un cout de: "+getNetPrice() +" et son editeur est: "+publisher.toString();
    }

    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public String getTitle(){
        return title;
    }

}

