package com.Semaine03.Jeudi05.TpBaseAzote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RNA {
    private ArrayList<Base> baseList = new ArrayList<Base>();
    private ArrayList<Base> transciptionList = new ArrayList<Base>();  //getter
    private  ArrayList<AmineAcid> amineAcidsList  = new ArrayList<AmineAcid>() ;
    private  ArrayList<Protein> proteinsList;





        public RNA( ArrayList<Base> baseList ){
            this. baseList = baseList;

            for( int i = 0 ; i <  baseList.size() ;i++){
                transciptionList.add( new Base( transciptionRNA( baseList.get(i).getAppariement() ) ) );
            }
/*
            if( transciptionList.size() > 2 ){
                int charProcess = 0;
                while( charProcess <  transciptionList.size() ){
                    String trigram = "";
                    if( ( transciptionList.size() - charProcess) > 2) {
                        for( int i = 0 ; i < 3 ; i++){
                            trigram =  trigram + transciptionList.get(charProcess+i).getSymbol();
                        }
                        System.out.println(trigram);

                        amineAcidsList.add( new AmineAcid( findCodon( trigram ) ) );
                        charProcess +=3;
                        System.out.println(amineAcidsList.size());
                    }
                    else{
                        System.out.println("Nombre de character restant ="+( transciptionList.size() - charProcess));
                        charProcess = transciptionList.size();
                    }
                }
                Protein protein = new Protein();
                proteinsList = protein.factory(amineAcidsList);
            }

*/
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















    public  ArrayList<AmineAcid> getAmineAcidList(){
        return amineAcidsList;
    }


}
