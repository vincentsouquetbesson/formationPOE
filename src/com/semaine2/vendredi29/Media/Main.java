package com.semaine2.vendredi29.Media;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Publisher tonkam = new Publisher("tonkam");
/*
        Media m1 = new Media(40,"salut c'est cool", tonkam);
        System.out.println( m1.toString() );

        Book b1 =  new Book(10,"harry",4000, tonkam);
        System.out.println(b1.toString());


        Media d = new DVD(40,"sans-titre01.dvdrip",1,tonkam);
        System.out.println(d.toString());
*/

        ArrayList<Media> mediaList = new ArrayList<>();
        mediaList.add(new Media(40,"salut c'est cool", tonkam) );
        mediaList.add(new Book(10,"harry",4000, tonkam));
        mediaList.add(new DVD(40,"sans-titre01.dvdrip",1,tonkam));

        for( int i = 0 ; i <  mediaList.size() ;i++) {
            System.out.println( mediaList.get(i).toString() );
        }
    }
}
