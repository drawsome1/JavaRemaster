package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //read 10 numbers from the console entered by the user
        //print the sum of those numbers.

        //create a Scanner

        //use the hasNextInt() method from the scanner to check if
        //the user has entered an int value
        //if hasNextInt() returns false, print the message "Invalid Number"
        //continue reading until you have read 10 numbers

        //use nextInt() to get int

        //Before user enters each number print the mesesage Enter number #x where x represents the count

        int countValidValues = 1;
        int runningSum = 0;

        Scanner scanner = new Scanner(System.in);

        while(countValidValues <= 10) {
            System.out.println("Enter number #" + countValidValues);
            if (scanner.hasNextInt()) {
                countValidValues++;
                runningSum += scanner.nextInt();
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();//used to capture the enter key post nextInt()
        }

        System.out.println("sum = " + runningSum );
        scanner.close();
    }
}
