package com.Semaine03.Mercredi04.fichier;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try{
            MesureRepository mr = new MesureRepository();
            mr.load("mesure.csv");

            System.out.println( mr.getTheoricalList() );
            mr.getDifferenceList();
            System.out.println("diff   "+mr.getTimeDifferenceErrorList(0.1));


            mr.getQuadraticList();
            System.out.println("Quadra "+mr.getTimeQuadraticErrorList(0.01) );

        }
        catch(FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
