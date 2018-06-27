package com.semaine2.mercredi27;

public class Customer {

    private static long  numberInstanceCustomer = 0;
    private long id;
    private String name;
    private String adress;

    public Customer( String name, String adress){
        numberInstanceCustomer++;
        id = numberInstanceCustomer;
        this.name = name;
        this.adress = adress;
    }

     public String toString( ){
        return " utilisateur :"+id+" nom :"+name+" adresse :"+adress;
    }


}
