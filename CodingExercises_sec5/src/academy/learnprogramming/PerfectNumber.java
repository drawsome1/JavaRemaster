package academy.learnprogramming;

public class PerfectNumber {
    //What is the perfect number?
    //A perfect number is a positive integer which is equal to the
    //sum of its proper positive divisors. A proper positive divisors
    //are positive integers that fully divide the perfect number without
    //leaving a remainder and exclude the perfect number itself

    //Write a method named isPerfectNumber with one parameter of type int
    //name number. if number is < 1, the method should return false.
    //The method must calculate if the number is perfect. if the number
    //is perfect, the method should return true; otherwise, is should return
    //false.

    public static boolean isPerfectNumber(int number){
        boolean errValue = false;
        if(number < 1){
            return errValue;
        }

        int sumDivisors = 0;
        int testDivisor = 1;

        while(testDivisor < number){
            if(number % testDivisor == 0){
                sumDivisors = sumDivisors + testDivisor;
            }
            testDivisor++;
        }

        //success criteria
        if(sumDivisors == number){
            return true;
        }

        return errValue;
    }
}
