package com.semaine2.vendredi29.Media;

public class Media {
    double price;
    String title;
    Publisher publisher;

    public Media( double price , String title , Publisher publisher ){
        this.price = price;
        this.title = title;
        this.publisher = publisher;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }


    public double getNetPlace(){
        return price + (( price /100)* 20 );
    }

    public String toString(){
        return "Le media: "+title+" à un cout de: "+getNetPlace() +" et son editeur est: "+publisher.toString();
    }
}
