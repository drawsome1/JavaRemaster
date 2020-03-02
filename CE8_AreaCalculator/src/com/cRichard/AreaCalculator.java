package com.cRichard;

public class AreaCalculator {
    public static double area(double radius){
        double returnVal = -1d;

        if(radius >= 0d){
           return Math.PI * radius * radius;
        }

        return returnVal;
    }

    public static double area(double x, double y) {
        double returnVal = -1d;

        if((x >= 0d) && (y >= 0d)){
           return (x * y);
        }

        return returnVal;
    }
}
