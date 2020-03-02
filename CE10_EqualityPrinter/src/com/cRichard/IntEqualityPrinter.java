package com.cRichard;

import javax.print.DocFlavor;

public class IntEqualityPrinter {
    public static String AE = "All numbers are equal";
    public static String AD = "All numbers are different";
    public static String NED = "Neither all are equal or different";
    public static String IV = "Invalid Value";

    public static void printEqual(int v1, int v2, int v3){
        if((v1 < 0) || (v2 < 0) || (v3 < 0)){
            System.out.println(IV);
            return;
        }

        if(v1 == v2){
            if(v2 == v3){
                System.out.println(AE);
            }
            else{
                System.out.println(NED);
            }
        }
        else if(v2 == v3){

            if(v2 != v3){
                System.out.println(AD);
            }
            else{
                System.out.println(NED);
            }
        }
        else if(v2 == v3){


        }
//        int count = 0;
//        switch (v1){
//            case v2: count++;
//
//        }
    }
}
