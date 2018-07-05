package com.Semaine03.Jeudi05.TpBaseAzote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ribosome {

    private ArrayList<Base> transciptionList = new ArrayList<Base>();  //getter
    private  ArrayList<AmineAcid> amineAcidsList  = new ArrayList<AmineAcid>() ;
    private static Map<String,String> codonMap = new HashMap<>();

    public ArrayList<AmineAcid> translate(RNA rna){
        transciptionList = rna.getTransciptionList();
        codonMapSet();

        if( transciptionList.size() > 2 ) {
            int charProcess = 0;
            while (charProcess < transciptionList.size()) {
                String trigram = "";
                if ((transciptionList.size() - charProcess) > 2) {
                    for (int i = 0; i < 3; i++) {
                        trigram = trigram + transciptionList.get(charProcess + i).getSymbol();
                    }
                    System.out.println(trigram);

                    amineAcidsList.add(new AmineAcid(findCodon(trigram)));
                    charProcess += 3;
                    System.out.println(amineAcidsList.size());
                } else {
                    System.out.println("Nombre de character restant =" + (transciptionList.size() - charProcess));
                    charProcess = transciptionList.size();
                }
            }
        }
        return amineAcidsList;
    }


    private String findCodon( String trigram){
        return codonMap.get(trigram);
    }


    private void codonMapSet(){
        codonMap.put("UUU","F");
        codonMap.put("UUC","F");
        codonMap.put("UUA","L");
        codonMap.put("UUG","L");
        codonMap.put("CUU","L");
        codonMap.put("CUC","L");
        codonMap.put("CUA","L");
        codonMap.put("CUG","L");
        codonMap.put("AUU","I");
        codonMap.put("AUC","I");
        codonMap.put("AUA","I");
        codonMap.put("AUG","M");
        codonMap.put("GUU","V");
        codonMap.put("GUC","V");
        codonMap.put("GUA","V");
        codonMap.put("GUG","V");
        codonMap.put("UCU","S");
        codonMap.put("UCC","S");
        codonMap.put("UCA","S");
        codonMap.put("UCG","S");
        codonMap.put("CCU","P");
        codonMap.put("CCC","P");
        codonMap.put("CCA","P");
        codonMap.put("CCG","P");
        codonMap.put("ACU","T");
        codonMap.put("ACC","T");
        codonMap.put("ACA","T");
        codonMap.put("ACG","T");
        codonMap.put("GCU","A");
        codonMap.put("GCC","A");
        codonMap.put("GCA","A");
        codonMap.put("GCG","A");
        codonMap.put("UAU","Y");
        codonMap.put("UAC","Y");
        codonMap.put("UAA"," ");
        codonMap.put("UAG"," ");
        codonMap.put("CAU","H");
        codonMap.put("CAC","H");
        codonMap.put("CAA","Q");
        codonMap.put("CAG","Q");
        codonMap.put("AAU","N");
        codonMap.put("AAC","N");
        codonMap.put("AAA","K");
        codonMap.put("AAG","K");
        codonMap.put("GAU","D");
        codonMap.put("GAC","D");
        codonMap.put("GAA","E");
        codonMap.put("GAG","E");
        codonMap.put("UGU","C");
        codonMap.put("UGC","C");
        codonMap.put("UGA"," ");
        codonMap.put("UGG","W");
        codonMap.put("CGU","R");
        codonMap.put("CGC","R");
        codonMap.put("CGA","R");
        codonMap.put("CGG","R");
        codonMap.put("AGU","S");
        codonMap.put("AGC","S");
        codonMap.put("AGA","R");
        codonMap.put("AGG","R");
        codonMap.put("GGU","G");
        codonMap.put("GGC","G");
        codonMap.put("GGA","G");
        codonMap.put("GGG","G");
    }

}
