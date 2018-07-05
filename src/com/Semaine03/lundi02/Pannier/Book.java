package com.Semaine03.lundi02.Pannier;

import java.io.Serializable;

public class Book extends Media implements Serializable {
    private int nbPage;

    public Book(double price, String title, int nbPage, Publisher publisher){
        super(price,title, publisher);
        this.nbPage = nbPage;
    }
    public Book(double price, String title, int nbPage){
        super(price,title, new Publisher("random"));
        this.nbPage = nbPage;
    }

    public int getNbPage(){
        return nbPage;
    }


    public double getNetPrice(){
        return super.getPrice() + (( super.getPrice() /100)* 5 );
    }

    @Override
    public String toString(){
        return "Le media: "+super.getTitle()+" à un cout de: "+getNetPrice() +"\n";
    }

}
