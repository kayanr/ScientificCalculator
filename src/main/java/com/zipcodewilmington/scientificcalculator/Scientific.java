package com.zipcodewilmington.scientificcalculator;
import java.lang.Math;
import java.util.Scanner;

public class Scientific {
    //Logarithmic Functions
    public static double logValue(double input1,double input2){

        double result = Math.log(input1) / Math.log(input2);
        return result;

        }

    public static double inverseLog(double input1){
        double result = Math.exp(Math.log(input1));
        return result;
    }

    public static double naturalLog(double input1){
        double result = Math.log(input1);
        return result;
    }

    public static double inverseNatLog(double input1){
        double result = Math.exp(input1);
        return result;
    }

    //Trig Function - Maisha

    public static double sine(double input1) {
        input1 = Math.sin(input1);
        return input1;
    }

    public static double cosine(double input1) {
        input1 = Math.cos(input1);
        return input1;
    }

    public static double tangent(double input1) {
        input1 = Math.tan(input1);
        return input1;
    }

    public static double inverseSine(double input1) {
        input1 = 1/Math.sin(input1);
        return input1;
    }

    public static double inverseCosine(double input1) {
        input1 = 1/Math.cos(input1);
        return input1;
    }

    public static double inverseTangent(double input1) {
        input1 = 1 / Math.tan(input1);
        return input1;
    }

    //Factorial - Maisha

    public static double factorial(double input1){
        double result = 1;

        double floorNum = Math.floor(input1);

        for ( double i = floorNum; i > 0; i--){
            result = result * i;
        }

        return result;

    }

}


