package com.semaine2.mercredi27;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Transaction {

    private static long  numberInstanceTransaction = 0;
    private long id;
    private static Calendar cal = new GregorianCalendar();

    private String date;
    private double montant;

    private Account emetteur;
    private Account recepteur;

    public Transaction(double montant){
        numberInstanceTransaction++;
        id = numberInstanceTransaction;

        date =  cal.get(Calendar.DAY_OF_MONTH )+":"+( cal.get(Calendar.MONTH) +1 )+":"+cal.get(Calendar.YEAR) ;
        System.out.println(date);
    }

    public Transaction(double montant, Account emeteur, Account recepteur){
        numberInstanceTransaction++;
        id = numberInstanceTransaction;

        date =  cal.get(Calendar.DAY_OF_MONTH )+":"+( cal.get(Calendar.MONTH) +1 )+":"+cal.get(Calendar.YEAR) ;
        System.out.println(date);
        this.montant = montant;
        this.emetteur = emeteur;
        this.recepteur = recepteur;

        if(montant > 0){    //  emeteur vers receveur
            emeteur.retrait(montant);
            recepteur.depot(montant);
        }
    }


    public  String toString(){
        return id+" "+date+" "+montant+" "+ emetteur.getID()+" "+recepteur.getID();
    }


}
