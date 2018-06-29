package com.semaine2.vendredi29.figure;

import com.semaine2.vendredi29.figure.Point;
import com.semaine2.vendredi29.figure.Rectangle;

public class TriangleRectangle extends Rectangle {
    //Herite de rectangle
    //get surface
    //hypothenus
    //perimetre

   // private double width;
 //   private double height;
    private Point origin = new Point(0,0); // Relation 1

    public TriangleRectangle(double width, double height){
        super( width , height );
    }



    public double getSurface(){
        return  (super.getSurface() )/2;
    }

    public double getHypothenus(){
        return Math.sqrt( Math.pow(getWidth(),2) + Math.pow(getHeight(),2));
    }


    public double getPerimeter(){
        return getWidth() + getHeight() + getHypothenus();
    }

    public String toString(){
        return "Le triangle a une surface de "+getSurface()+" et un perimetre de "+getPerimeter();
    }

}
