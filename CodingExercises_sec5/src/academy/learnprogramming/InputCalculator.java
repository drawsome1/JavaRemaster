package academy.learnprogramming;

import java.util.Scanner;

public class InputCalculator {

    //Write a method called inputThenPrintSumAndAverage that does not have any parameters
    //The method should not return anything (void) and it needs to keep reading int numbers
    //from the keyboard.

    //When the user enters something that is not an int then it needs to print a message in the
    //format "SUM = XX AVG = YY".

    //XX represents the sum of all entered numbers of type int
    //YY represents the calculated average of all numbers of type long

    public static void inputThenPrintSumAndAverage(){
        int sumVal = 0;
        long avgVal = 0;
        int cntInput = 0;
        int curUserInputVal = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){

            if(!scanner.hasNextInt()){

                System.out.println("SUM = " + sumVal + " AVG = " + avgVal);
                break;
            }

            //at this point the value is guarenteed to be an int
            cntInput++;
            curUserInputVal = scanner.nextInt();
            scanner.nextLine(); //capture the enter key

            sumVal += curUserInputVal;
            avgVal = Math.round( (double)sumVal / (double)cntInput);

        }

        scanner.close();
    }


}
