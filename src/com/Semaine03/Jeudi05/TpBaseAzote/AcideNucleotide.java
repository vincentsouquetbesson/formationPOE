package com.Semaine03.Jeudi05.TpBaseAzote;

import java.util.ArrayList;
import java.util.List;

public abstract class AcideNucleotide {

    private ArrayList<Base> complementaryList;
    private ArrayList<Base> baseList;

    public ArrayList<Base> getBaseList(String brin){
        baseList = new ArrayList<>();
        complementaryList = new ArrayList<>();
        for( int i = 0 ; i <  brin.length() ;i++){
            baseList.add( new Base( brin.substring(i,i+1) ));
            complementaryList.add( new Base( baseList.get(i).getAppariement() ));
        }
        return baseList;
    }

    public ArrayList<Base> getComplementaryList(){
        return complementaryList;
    }
}
