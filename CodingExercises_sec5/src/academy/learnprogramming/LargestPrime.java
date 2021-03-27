package academy.learnprogramming;

public class LargestPrime {
    //Write a method name getLargestPrime with one parameter of type int named number
    //if the number is negative or does not haev any prime numbers, the method should
    //return -1 to indicate an invalid value.

    //The method should calculate the largest prime factor of a given number and
    //return it

    public static int getLargestPrime(int number){
        int errValue = -1;

        if(number <= 1){
            return errValue;
        }

        boolean isPrime = true;
        int valToCheck = number - 1;

        //check if the number itself is prime if it is return it
        for(int i = 2; i <= number/2; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }

        //the number itself is prime
        if(isPrime){
            return number;
        }

        //starting from number - 1 going down find the first prime factor
        while(valToCheck > 1){
            //reset isPrime flag
            isPrime = true;

            //check if the value to check is a factor
            if (number % valToCheck == 0) {
                //see if the value to check is prime
                for(int i = 2; i <= valToCheck/2; i++){
                    if(valToCheck % i == 0){
                        isPrime = false;//if we find something it's not prime
                    }
                }

                //The number is a factor and if it is prime return it
                if(isPrime){
                    return valToCheck;
                }
            }
            valToCheck--;
        }
        return errValue;
    }
}
