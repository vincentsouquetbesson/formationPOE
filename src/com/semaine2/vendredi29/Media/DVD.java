package com.semaine2.vendredi29.Media;

public class DVD extends Media{
    int nbRegion;

    public DVD(double price, String title, int nbRegion, Publisher publisher){
        super(price,title, publisher);
        this.nbRegion = nbRegion;
    }

    public String toString(){
        return "Le media: "+title+" à un cout de: "+getPriceCuts()+" et il vien de la region "+ getRegion() ;
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


    public double getPriceCuts(){
        return getNetPlace() + ( ( getNetPlace() /100)*20);
    }

}
