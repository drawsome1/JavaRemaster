package com.cRichard;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        //variables
        long minInHr = 60L;
        long hrInDay = 24L;
        long daysInYr = 365L;

        if(minutes < 0){
            System.out.println("Invalid Value");
            return;
        }

        long numOfHrs = minutes / minInHr;
        long numOfDays = numOfHrs / hrInDay;
        long numOfYears = numOfDays / daysInYr;
        long numOfRemainingDays = numOfDays % daysInYr;


        System.out.println(minutes + " min = "
            + numOfYears + " y and "
            + numOfRemainingDays + " d");
    }

}
