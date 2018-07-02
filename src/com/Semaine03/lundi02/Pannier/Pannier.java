package com.Semaine03.lundi02.Pannier;

import java.util.ArrayList;

public class Pannier {
    int nbArticl;
    private ArrayList<Quantity> quantitiesList;


    public Pannier(){
        nbArticl = 0;
    //    mediaList = new ArrayList<>();
        quantitiesList =new ArrayList<>();
    }


    public void addMedia(Media mediaAdd){
        for( int i = 0 ; i <  quantitiesList.size() ;i++) {
            if(mediaAdd.equals( quantitiesList.get(i).getMedia() ) ){
                System.out.println("valeur trouvé");
                quantitiesList.get(i).addQuantity();
                return;
            }
        }
        quantitiesList.add( new Quantity(mediaAdd) );
    }


    public void removeMedia(Media mediaAdd){
        for( int i = 0 ; i <  quantitiesList.size() ;i++) {
            if(mediaAdd.equals( quantitiesList.get(i).getMedia() ) ){
                quantitiesList.remove(i);
                return;
            }
        }
        quantitiesList.add( new Quantity(mediaAdd) );
    }



    public String getTotalNetPrice( ){
        double totalNetPrice = 0;
        for( int i = 0 ; i <  quantitiesList.size() ;i++) {
            totalNetPrice += quantitiesList.get(i).getNetPrice();
        }
        return "le prix total est: "+totalNetPrice;
    }
}
