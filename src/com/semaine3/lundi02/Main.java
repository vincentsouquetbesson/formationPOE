package com.semaine3.lundi02;


public class Main {
    public static void main(String[] args) {

        Publisher tonkam = new Publisher("tonkam");
        Pannier pannier = new Pannier();


        Media b1 =  new Book(10,"harry",4000, tonkam);
        System.out.println(b1.toString());
        Media d1 = new DVD(40,"sans-titre01.dvdrip",1,tonkam);
        System.out.println(d1.toString());


        pannier.addMedia(b1);
        pannier.addMedia(d1);
        System.out.println("add : "+pannier.getTotalNetPrice());
        pannier.removeMedia(d1);
        System.out.println("remove : "+pannier.getTotalNetPrice());

        pannier.addMedia(b1);
        System.out.println("double : "+pannier.getTotalNetPrice());

    }
}
