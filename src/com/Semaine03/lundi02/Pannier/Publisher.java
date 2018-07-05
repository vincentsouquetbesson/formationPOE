package com.Semaine03.lundi02.Pannier;

import java.io.Serializable;

public class Publisher implements Serializable {
    String name;

    public Publisher( String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}