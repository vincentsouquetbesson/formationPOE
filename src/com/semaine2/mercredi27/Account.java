package com.semaine2.mercredi27;

import java.util.ArrayList;

public class Account {

    private Customer customer;
    private static long  numberInstance = 0;
    private long numberAccount;
    private double solde;
    private ArrayList<Double> monthlyFee;


    // Passer les attributs en private
    // Créer les getters setters
    // Créer un constructeur sans paramètre (constructeur par défaut)
    // Créer un constructeur avec les paramètres obligatoires
    // Créer toString


    public Account(){
       // this.customer = ;
        numberInstance++;
        numberAccount = numberInstance;
        solde = 0;
        System.out.println("Compte numero "+numberAccount+" crée");
        monthlyFee = new ArrayList<Double>();
    }




    public Account(Customer owner){
        this.customer = owner;
        numberInstance++;
        numberAccount = numberInstance;
        solde = 0;
        System.out.println("Compte numero "+numberAccount+" crée");
        monthlyFee = new ArrayList<Double>();
    }


    public void newOwner(Customer owner){
        this.customer = owner;
    }

    private void newSolde( int solde){
        this.solde = solde;
    }

    public Customer getowner(){
        return customer;
    }


    public long getID(){
        return numberAccount;
    }

    public String toString(){
        return customer.toString() +"\n Son compte est le nb: "+numberAccount+" et il contient: "+solde;
    }






    public void depot(double amount){
        solde += amount;
    }

    public void retrait( double amount ){
        solde -= amount;
    }

    public void display(){
        System.out.println("Il reste "+solde+"€ sur le compte "+numberAccount);
    }

    public void createFee( double fee){
        monthlyFee.add(fee);
    }
/*
    public void newMonth(){
        for(int i : monthlyFee) {
            solde += monthlyFee[i];
        }
    }
*/

}
