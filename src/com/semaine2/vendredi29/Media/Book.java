package com.semaine2.vendredi29.Media;

public class Book extends Media{
    int nbPage;

    public Book(double price, String title, int nbPage, Publisher publisher){
        super(price,title, publisher);
        this.nbPage = nbPage;
    }

    public double getNetPlace(){
        return price + (( price /100)* 5 );
    }

}
