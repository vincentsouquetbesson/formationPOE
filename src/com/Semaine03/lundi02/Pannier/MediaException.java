package com.Semaine03.lundi02.Pannier;

public class MediaException extends Exception {

    public MediaException(String a){
        System.out.println(a);
    }

    public void pannierException(){
        System.out.println("send help");
    }
}
