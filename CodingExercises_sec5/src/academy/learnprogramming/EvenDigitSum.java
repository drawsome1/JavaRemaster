package academy.learnprogramming;

public class EvenDigitSum {

    //Write a method named getEvenDigitSum with one parameter of type int
    //called number. The method should return the sum of the even digits
    //within the number.
    //If the number is negative, the method should return -1 to indicate
    //and invalid value.

    public static int getEvenDigitSum(int number){
        int errVal = -1;
        int digitSum = 0;
        int curDigit = 0;

        if(number < 0){// if the number is negative
            return errVal;
        }

        while(number != 0){
            curDigit = (number % 10);
            if((curDigit % 2) == 0){// if the current digit is even
                digitSum += curDigit;
            }
            number = number / 10;// remove the least significant digit
        }

        return digitSum;
    }
}
