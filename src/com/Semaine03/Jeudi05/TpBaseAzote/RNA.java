package com.Semaine03.Jeudi05.TpBaseAzote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RNA {
    private ArrayList<Base> baseList = new ArrayList<Base>();
    private ArrayList<Base> transciptionList = new ArrayList<Base>();  //getter



    public RNA( ArrayList<Base> baseList ){
        this. baseList = baseList;
        for( int i = 0 ; i <  baseList.size() ;i++){
            transciptionList.add( new Base( transciptionRNA( baseList.get(i).getAppariement() ) ) );
        }
    }



    public String getTranscription(){
        String reponse = "";
        for( int i = 0 ; i <  baseList.size() ;i++) {
            reponse = reponse + transciptionList.get(i).toString() + " ";
        }
        return "transciption:        "+reponse;
    }



    public String transciptionRNA( String nextCharComp){
        if( nextCharComp == "T" ){
            return "U";
        }
        else{
            return nextCharComp;
        }
    }

    public ArrayList<Base> getTransciptionList(){
            return transciptionList;
    }

}
