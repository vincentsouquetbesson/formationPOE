package com.semaine2.TpBaseAzote;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        DNA dna1 =new DNA("CGAGCA");
        RNA rna1;
        ArrayList<AmineAcid> amineAcidsList  = new ArrayList<AmineAcid>() ;

        System.out.println( dna1.toString() );
        System.out.println( dna1.getComplementary() );
        rna1 = dna1.getRNA();

        System.out.println( rna1.getTranscription() );
        amineAcidsList = rna1.getAmineAcidList();

        System.out.print(" les amines acide : "+ amineAcidsList.toString() ) ;


    }
}
