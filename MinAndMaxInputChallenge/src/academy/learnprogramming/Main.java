package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Read the numbers from the console entered by the user and print the minimum and
        //maximum number the user has entered.
        //Before the user enters the number, print the message "Enter number."
        //If the user enteres an invalid number, break out of the loop and print the
        //minimum and maximum number.

        Scanner scanner = new Scanner(System.in);
        int userInputVal = 0;
        int min = 0;
        int max = 0;

        while(true){
            System.out.println("Enter number.");

            //If the value passed in is invalid
            if(!scanner.hasNextInt()){

                System.out.println("Minimum number = " + min);
                System.out.println("Maximum number = " + max);
                break;
            }
            else {
                userInputVal = scanner.nextInt();

                //Initializing the value
                if(min == 0 && max == 0) {
                    min = userInputVal;
                    max = userInputVal;
                }

                //If the input is the new min
                if(userInputVal < min){
                    min = userInputVal;
                }
                //if the input is the new max
                if(userInputVal > max){
                    max = userInputVal;
                }
            }

            scanner.nextLine();// used to capture the enter key
        }

        scanner.close();
    }
}
