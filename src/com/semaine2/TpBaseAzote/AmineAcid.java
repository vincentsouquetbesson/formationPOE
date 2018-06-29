package com.semaine2.TpBaseAzote;

public class AmineAcid {
    private String symbol;
    private String trigram;
    private String name;


    public AmineAcid( String symbol ){
        this.symbol = symbol;
        findName();

    }



    public void findName(){
        switch (symbol){
            case "A":
                name = "Alanine";
                break;
            case "R":
                name = "Arginine";
                break;
            case "N":
                name = "Asparagine";
                break;
            case "D":
                name = "Aspartate";
                break;
            case "C":
                name = "Custeine";
                break;
            case "E":
                name = "Glutamate";
                break;
            default:
                break;
        }
    }


    public String toString(){
        return name;
    }

}
