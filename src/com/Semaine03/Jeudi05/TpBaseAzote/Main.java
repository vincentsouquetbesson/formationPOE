package com.Semaine03.Jeudi05.TpBaseAzote;

import java.util.ArrayList;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        RNA rna;
        ArrayList<AmineAcid> amineAcidsList  = new ArrayList<AmineAcid>() ;


        try{
            DNARepository dnaRepository = new DNARepository();
            dnaRepository.load();
            rna = dnaRepository.getRNA();
            System.out.println( rna.getTranscription() );
            Ribosome ribosome = new Ribosome();
            amineAcidsList = ribosome.translate(rna);
            Protein protein = new Protein();
            ArrayList<Protein> proteinsList;
            proteinsList = protein.factory(amineAcidsList);

            for(int i = 0; i<proteinsList.size();i++){
                for (int j =0;j<proteinsList.get(i).getChain().size();j++){
                    System.out.print(proteinsList.get(i).getChain().get(j).getSymbol());
                }
                System.out.println(" ");
            }
            System.out.println(proteinsList);


        }
        catch(FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
