package com.Semaine03.lundi02.Pannier;

public class DVD extends Media {
    private int nbRegion;

    public DVD(double price, String title, int nbRegion, Publisher publisher){
        super(price,title, publisher);
        this.nbRegion = nbRegion;
    }

    public String toString(){
        return "Le media: "+super.getTitle()+" à un cout de: "+getPriceCuts()+" et il vien de la region "+ getRegion() ;
    }

    public String getRegion(){
        switch(nbRegion){
            case 1:
                return "Europe";
            case 2:
                return "USA";
            case 3:
                return "Afrique";
            case 4:
                return "Asie";
            case 5:
                return " Oceanie";
            default:
                return "erreur";
        }
    }


  //  @Override
    public double getPriceCuts(){
        return ( getNetPrice() /100)*80;
    }
}
