package com.Semaine03.Jeudi05.TpBaseAzote;

public class AmineAcid {
    private String symbol;
    private String trigram;
    private String name;


    public AmineAcid( String symbol ){
        //System.out.println(symbol);
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
                name = "NotFound";
                break;
        }
    }


    public String toString(){
        return symbol+"."+name;
    }

    public String getSymbol(){
        return symbol;
    }

}
