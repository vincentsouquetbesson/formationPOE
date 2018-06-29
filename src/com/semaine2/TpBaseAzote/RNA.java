package com.semaine2.TpBaseAzote;

import java.util.ArrayList;

public class RNA {
    private ArrayList<Base> brinList = new ArrayList<Base>();
    private ArrayList<Base> transciptionList = new ArrayList<Base>();  //getter
    private  ArrayList<AmineAcid> amineAcidsList  = new ArrayList<AmineAcid>() ;



        public RNA( ArrayList<Base> brinList ){
            this. brinList = brinList;
            for( int i = 0 ; i <  brinList.size() ;i++){
                transciptionList.add( new Base( transciptionRNA( brinList.get(i).getAppariement() ) ) );
            }

            if( transciptionList.size() > 2 ){
                int charProcess = 0;
                while( charProcess <  transciptionList.size() ){
                    if( ( transciptionList.size() - charProcess) > 2) {
                        amineAcidsList.add( new AmineAcid( findCodon( charProcess ) ) );
                        charProcess +=3;
                    }
                    else{
                        System.out.println("Nombre de character incorecte");
                        charProcess = transciptionList.size();
                    }
                }
            }

    }



    public String getTranscription(){
        String reponse = "";
        for( int i = 0 ; i <  brinList.size() ;i++) {
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




    public String findCodon( int charProcess){
        String trigram = "";
        for( int i = 0 ; i < 3 ; i++){
            trigram =  trigram + transciptionList.get(charProcess+i).getSymbol();
        }
        System.out.println(trigram);

        switch (trigram){
            case "GCU":
                return "A";
            case "CGU":
                return "R";
            case "AAU":
                return "N";
            case "GAU":
                return "D";
            case "UGU":
                return "C";
            case "GAA":
                return "E";

            default:
                System.out.println("codon non trouvé");
                break;
        }
        return "";
    }



    public String findCodon2( int charProcess){
        switch (transciptionList.get(charProcess).getSymbol()){
            case "A":
                switch (transciptionList.get(charProcess+1).getSymbol()){
                    case "A":
                        switch (transciptionList.get(charProcess+2).getSymbol()){
                            case "A":
                                return "K";
                            case "C":
                                return "N";
                            case "G":
                                return "K";
                            case "U":
                                return "N";
                        }
                    case "C":
                        return "T";
                    case "G":
                        switch (transciptionList.get(charProcess+2).getSymbol()){
                            case "A":
                                return "R";
                            case "C":
                                return "S";
                            case "G":
                                return "R";
                            case "U":
                                return "S";
                        }
                    case "U":
                        switch (transciptionList.get(charProcess+2).getSymbol()) {
                            case "G":
                                return "M";
                            default:
                                return "I";
                        }
                }
            case "C":
                return "R";
            case "G":
                return "D";
            case "U":
                return "C";
            default:
                System.out.println("codon non trouvé");
                break;
        }
        return "";
    }
















    public  ArrayList<AmineAcid> getAmineAcidList(){
        return amineAcidsList;
    }


}
