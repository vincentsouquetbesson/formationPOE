package com.formation.lundi25;

public class DecimalValue {

    public static void main(String[] args) {

        String test = "\n";
    //    int decimal = (int) test;
        System.out.println("test");
    }


    public static int additionRecursif( int[] tab, int n ){
        if( n == 1){
            return tab[0];
        }
        else{
            return tab[n-1] + additionRecursif(tab,n-1);  // On demande la valeur précédente
        }
    }


    public static int soustractionRecursif( int[] tab, int n ){
        if( n == 1){
            return tab[0];
        }
        else{
            return tab[n-1] + soustractionRecursif(tab,n-1);  // On demande la valeur précédente
        }
    }


}
