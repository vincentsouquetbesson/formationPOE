package com.formation.lundi25;

public class Main {

    public static void main(String[] args) {
        int[] tab = { 1,2,3,4,5,6,7,8,9 };

        tab = getPrimeNumber(tab);
        System.out.println("Nombre Premier");
        showPrimeNumber(tab,0);
    }


    public static int[] getPrimeNumber(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if(testPremier( tab[i] )== false) {
                tab[i] = 0;
            }
        }
        return tab;
    }


    public static boolean testPremier(int chiffreTest) {
        boolean etatNombrePremier = true;
        if (chiffreTest < 0){    //Si inferieur a zero
            etatNombrePremier = false;
        }
        else {
            if (chiffreTest != 0 && chiffreTest != 1) {  // Si le chiffre n'est pas zero ou 1
                for (int i = 2; i <= chiffreTest/2; i++) { // On parcourt les modulo en partant de 2
                    if (chiffreTest != i && chiffreTest % i == 0) {     //Si le numero n'est pas egal a i est que le modulo est 0
                        etatNombrePremier = false; 				// c'est un chiffre premier
                        break;
                    }
                }
            }
        }
        return etatNombrePremier;
    }


    public static void showPrimeNumber(int[] tabPrime , int position ) {  //Récursif
        if( tabPrime[position] != 0)
            System.out.println( tabPrime[ position ] );
        if(position == tabPrime.length -1) {
            return;
        }
        else {
            position++;
            showPrimeNumber(tabPrime, position);
        }
    }
}
