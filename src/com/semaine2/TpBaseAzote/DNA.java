package com.semaine2.TpBaseAzote;

import java.util.ArrayList;

public class DNA {
    private ArrayList<Base> brinList = new ArrayList<Base>();
    private ArrayList<Base> complementaryList = new ArrayList<Base>();  //getter
    private  RNA rna;




    public DNA( String brin){
        for( int i = 0 ; i <  brin.length() ;i++){
            brinList.add( new Base( brin.substring(i,i+1) ));
            complementaryList.add( new Base( brinList.get(i).getAppariement() ));
        }
        rna = new RNA(brinList);
    }

    public String toString(){
        String reponse = "";
        for( int i = 0 ; i <  brinList.size() ;i++) {
            reponse = reponse + brinList.get(i).toString() + " ";
        }
        return "brin:                 "+ reponse;
    }


    public String getComplementary(){
        String reponse = "";
        for( int i = 0 ; i <  complementaryList.size() ;i++) {
            reponse = reponse + complementaryList.get(i).toString() + " ";
        }
        return "complementaire ADN:  "+ reponse;
    }




    public RNA getRNA(){
        return rna;
    }



}
