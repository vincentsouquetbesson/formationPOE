package com.semaine2.mercredi27;

public class Point {
    double x ;
    double y;

    void moveTo( double x, double y){
        this.x = x;
        this.y = y;
    }

    void display(){
        System.out.println("( "+x+" , "+y+" )");
    }

    void moveRelative( double x , double y){
        this.x += x;
        this.y += y;
    }
}
