package com.Semaine03.Jeudi05.TpBaseAzote;

import java.util.ArrayList;

public abstract class DNA extends AcideNucleotide{
    private ArrayList<Base> baseList;
    private ArrayList<Base> complementaryList;  //getter
    private RNA rna;



/*
    public DNA( String brin){
        for( int i = 0 ; i <  brin.length() ;i++){
            baseList.add( new Base( brin.substring(i,i+1) ));
            complementaryList.add( new Base( baseList.get(i).getAppariement() ));
        }
        rna = new RNA(baseList);
    }
    */


    public void getDNA(String brin){
        baseList = super.getBaseList(brin);
        complementaryList = super.getComplementaryList();

        System.out.println(baseList);
        System.out.println(complementaryList);
    }



    public String toString(){
        String reponse = "";
        for( int i = 0 ; i <  baseList.size() ;i++) {
            reponse = reponse + baseList.get(i).toString() + " ";
        }
        return "brin:                 "+ reponse;
    }




/*
    public String getComplementary(){
        String reponse = "";
        for( int i = 0 ; i <  complementaryList.size() ;i++) {
            reponse = reponse + complementaryList.get(i).toString() + " ";
        }
        return "complementaire ADN:  "+ reponse;
    }
*/



    public RNA getRNA(){
        System.out.println(baseList.size());
        rna = new RNA(baseList);
        return rna;
    }



}
