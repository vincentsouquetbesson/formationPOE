package com.Semaine03.lundi02.Pannier;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Publisher tonkam = new Publisher("tonkam");
        Pannier pannier = new Pannier();


        IMedia  b1 =  new Book(10,"harry",4000, tonkam);
        System.out.println(b1.toString());
        IMedia d1 = new DVD(40,"sans-titre01.dvdrip",1,tonkam);
        System.out.println(d1.toString());


        pannier.addMedia(b1);
        pannier.addMedia(d1);
        System.out.println("add : "+pannier.getTotalNetPrice());
        pannier.removeMedia(d1);
        System.out.println("remove : "+pannier.getTotalNetPrice());

        pannier.addMedia(b1);
        System.out.println("double : "+pannier.getTotalNetPrice());





        Book b2 =  new Book(10,"harry",4000, tonkam);
        Book b3 =  new Book(20,"IWTD",50, tonkam);


        try{
            BookRepository bookRepository = new BookRepository();
            bookRepository.load("media.csv");
            System.out.println(bookRepository.getAll());
            bookRepository.add(b2);
            bookRepository.add(b3);


        }
        catch(FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }/*catch( ClassNotFoundException ef){
            ef.printStackTrace();
        }*/


    }


}
