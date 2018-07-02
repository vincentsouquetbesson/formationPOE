package com.Semaine03.lundi02.Pannier;

public class Book extends Media {
    private int nbPage;

    public Book(double price, String title, int nbPage, Publisher publisher){
        super(price,title, publisher);
        this.nbPage = nbPage;
    }

    public double getNetPrice(){
        return super.getPrice() + (( super.getPrice() /100)* 5 );
    }

}
