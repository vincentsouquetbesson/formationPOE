package com.formation.mardi26;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Methode qui font sum, min, max, average, getprimeNumbers
        //TP moyen : inverse => 1,2,3,4 renvoi 4,3,2,1
        //tp difficile :  refaire inverse sans créer une nouvelle liste cad

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(8);  // 2,4,7,8
        int n = list.size();
        System.out.println("la somme du tableau : "+ additionRecursif(list,n));
        System.out.println("la valeur min du tableau : "+ min(list,n));
        System.out.println("la valeur min en recursif : "+ minRecursif(list, n, 0));
        System.out.println("la valeur max du tableau : "+ max(list,n));
        System.out.println("la valeur max en recursif : "+ maxRecursif(list, n, 0));
        System.out.print("les nombre premier sont :");
        getPrimeNumbers(list);

        ArrayList<Integer> listInverser = new ArrayList<>();
        inversionRecurs(list, listInverser, n);
        System.out.print("\nla liste inverser : ");

        System.out.print(listInverser);


        inversionRecursWithoutNew(list, n);
        System.out.print("\nla liste inverser sans nouveau: ");
        System.out.println(list);


    }

    public static int additionRecursif(ArrayList<Integer> list, int n ){
        if( n == 1){
            return list.get(0);
        }
        else{
            return list.get(n-1) + additionRecursif(list,n-1);  // On demande la valeur précédente
        }
    }

    public static int min( ArrayList<Integer> list, int n ){
        int min = list.get(0);
        for (int i = 1; i < n ; i++){
            if( min > list.get(i)){
                min = list.get(i);
            }
        }
        return min;
    }

    public static int minRecursif( ArrayList<Integer> list, int n , int min ){
        if( list.size() == n){
            min = list.get(n-1);
        }
        else{
            if (list.get(n-1) < min) {
                min = list.get(n - 1);
            }
        }
        if( n != 1 ) {
            min = minRecursif(list, n-1, min);
        }
        return min;
    }




    public static int max( ArrayList<Integer> list, int n ){
        int max = list.get(0);
        for (int i = 1; i < n ; i++){
            if( max < list.get(i)){
                max = list.get(i);
            }
        }
        return max;
    }

    public static int maxRecursif( ArrayList<Integer> list, int n , int max ){
        if( list.size() == n){
            max = list.get(n-1);
        }
        else{
            if (list.get(n-1) > max) {
                max = list.get(n - 1);
            }
        }
        if( n != 1 ) {
            max = maxRecursif(list, n-1, max);
        }
        return max;
    }




    public static void getPrimeNumbers( ArrayList<Integer> list) {
        for(int i : list) {
            if(isPrime(i)) {
                System.out.print(" "+i);
            }
        }
    }

    public static boolean isPrime(int n) {
        boolean result = true;
        if(n < 2) {
            result = false;
        }
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }


    public static void inversionRecurs( ArrayList<Integer> list, ArrayList<Integer> listInverser , int n ){
        if( n == 1){
            listInverser.add(list.get(0));
        }
        else{
            listInverser.add(list.get(n-1));
            inversionRecurs(list, listInverser, n-1);
        }
    }


    public static void inversionRecursWithoutNew( ArrayList<Integer> list, int n ){
        if( n == 1){
            list.add( list.get(0) );
           list.remove(0);
        }
        else{
            list.add( list.get(n-1) );
            list.remove(n-1);
            inversionRecursWithoutNew(list, n-1);
        }
    }





}
