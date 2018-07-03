package com.Semaine03.mardi03.Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // 1 Créer une collection de 10 doubles
        // 2 Filtrer les chiffres pairs
        // 3 Filtrer les chiffres pairs + appliquer un cos
        // 4 Filtrer les nombres premiers
        // 5 Filtrer les nombres premiers + appliquer une tangeante + filtrer les positifs

        ArrayList<Double> l = new ArrayList<>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0));
        System.out.println("Base: "+ l );

        Stream<Double> stream = l.stream().filter(x -> x % 2==0);
        System.out.println("Pair: "+stream.collect(Collectors.toList()));
        stream = l.stream().filter(x -> x % 2==0).map( x -> Math.cos(x) );
        System.out.println("cos:  "+stream.collect(Collectors.toList()));

       // Stream<Boolean> stream2 = l.stream().filter(x -> Main.isPrime(x));
       // System.out.println("prime:  "+stream2.collect(Collectors.toList()));

       // stream2 = l.stream().filter(Main::isPrime).filter(x -> Math.abs(x) < 0.5);
       // System.out.println("prime:  "+stream2.collect(Collectors.toList()));
    }


    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
