package com.formation.mardi26;

import java.util.ArrayList;
import java.util.Arrays;


//Methode qui font sum, min, max, average, getprimeNumbers
//TP moyen : inverse => 1,2,3,4 renvoi 4,3,2,1
//tp difficile :  refaire inverse sans créer une nouvelle liste cad


public class Collection {
    public Collection(){
        int[] tab = {3,2,1};
        int[] tab2 = new int[10];
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(2);
        list1.add(4);
        list1.add(7);
        list1.add(8);  // 2,4,7,8
        list1.remove(1);  //2,7,8
        int elem = list1.get(0); //2
        elem = list1.get(2); //8
        int size = list1.size();
        list1.add(9);   //2,7,8,9
        list1.add(2,0);   //Insere 0 à l'indice 2 :  2,7,0,8,9

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2,4,7,8));

        int n = list2.size();
     //   System.out.println("la somme du tableau : "+ additionRecursif(n));
    }
/*
    public sum(){
        int
        list2
    }

    public static int additionRecursif(  int n ){
        if( n == 1){
            return list2.get(0);;
        }
        else{
            return tab[n-1] + additionRecursif(tab,n-1);  // On demande la valeur précédente
        }
    }
*/
}
