package com.Semaine03.Jeudi05.TpBaseAzote;

public class Base {
    private String symbol;
    private String name;
    private String familly;
    private String appariement;


    public Base(String type) {
        switch (type){
            case "A":
                this.symbol = "A";
                this.name = "Adénine";
                this.appariement = "T";
                break;
            case "C":
                this.symbol = "C";
                this.name = "Cytosine";
                this.appariement = "G";
                break;
            case "G":
                this.symbol = "G";
                this.name = "Guanine";
                this.appariement = "C";
                break;
            case "T":
                this.symbol = "T";
                this.name = "Thymine";
                this.appariement = "A";
                break;
            case "U":
                this.symbol = "U";
                this.name = "Uracile";
                this.appariement = "A";
                break;
            default:
                System.out.println("Erreur");
                break;

        }
    }


    public String toString(){
        return name;
    }

    public String getAppariement(){
        return appariement;
    }

    public String getSymbol(){
        return symbol;
    }

}
