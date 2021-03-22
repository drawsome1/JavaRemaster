package com.cRichard;

import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Calendar;



// write your code here
public class Main {

    private static double interest = 0d;

    public static void main(String[] args) {

        double startingPrincipal = 6699.03;
        int year = 2020;
        int month = 5; //June
        int date = 1; //arbitrary date
        int apr;
        int payment = 0;

        double balanceTransferFeePercent = 3d;
        double balanceTransferFee = startingPrincipal * (balanceTransferFeePercent/100d);

        interest += balanceTransferFee;

        double currentBalance = startingPrincipal;
        System.out.println("Starting Balance = " + currentBalance);

        int iterator = 0;
        while (currentBalance > 0)
        {
            //first few months will pay 800
            if (iterator >= 0 && iterator <= 3){
                payment = 100;
            }
            //will start to pay 600 after 4 payments
            else {
                payment = 300;
            }

            if(iterator < 18){
                apr = 0;
            }
            else{
                apr = 22;
            }

            System.out.println("==== iteration " + iterator + "=================");
            System.out.println("Current balace = " + currentBalance);
            currentBalance = calcMonthlyBalance(currentBalance,year,month,date,apr,payment,iterator);
            if (month == 11){
                month = 0;
            }
            else {
                month++;
            }
            iterator++;

            if (currentBalance > startingPrincipal){
                System.out.println("Nah Fuck This, You gotta pay more hommie");
                System.out.println("Total interest = " + interest);
                break;
            }
            else if (currentBalance == 0){
                System.out.println("paid off in " + iterator/12 + " years and "
                        + iterator%12 + " months");
            }
        }

    }

    //simulating making a payment

    public static double makePayment(double Principal, double payment,int month,int iterator){
        if (Principal - payment <= 0){
            payment = Principal;
        }
        System.out.println("Making a payment of: " + payment);

        if (month == 10){
            if (iterator == 5){
                payment += 0;
            }
            else {
                payment += 2000;
                System.out.println("Paid 1000 more from annual bonus");
            }
        }


        return Principal - payment;
    }

    public static int GetDaysInMonth(int year, int month, int date){
        // create a calendar object
        Calendar calendar = Calendar.getInstance();

        calendar.set(year,month,date);


        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public static double InterestAdded(double principal, int APR, int numDays){
        double daysInYear = 365.00d;

        if(APR > 100 || APR < 0){
            System.out.println("Invalid APR");
            return 0f;
        }

        double aprPercent = (double)APR / (double)100.00d;

        System.out.println("APR Percent = " + aprPercent);

        double interest = (principal * (aprPercent/daysInYear) * numDays);

        return round(interest);
    }

    public static double round(double amount){
        return Math.round(amount * 100.00d)/ 100.00d;
    }

    public static double calcMonthlyBalance(double Principal, int year, int month, int date, int apr, int payment,int iterator){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,date);


        double preInterest = makePayment(Principal,payment,month,iterator);
        System.out.println("balance before interest charge = " + preInterest);


        int numDays = GetDaysInMonth(year,month,date);
        System.out.println("Number of Days = " + numDays);

        double InterestThisMonth = InterestAdded(preInterest,apr,numDays);
        System.out.println("Interest added for the month of "
                + (new SimpleDateFormat("MMM").format(calendar.getTime()))
                + " = " + InterestThisMonth);

        interest += InterestThisMonth;
        System.out.println("Interest accrued: " + round(interest));



        double newTotal = preInterest + InterestThisMonth;
        System.out.println("New Total = " + round(newTotal));

        System.out.println("=======================================");

        return round(newTotal);
    }
}
