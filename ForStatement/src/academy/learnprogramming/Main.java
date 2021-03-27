package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        for(int i = 8; i >= 2; i--){
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
//        }

//        int a = 7;
//        int primeCount = 0;
//
//        for(int i = a; i > 0; i--){
//            if(isPrime(i)){
//                System.out.println(i);
//                primeCount++;
//            }
//
//            if(primeCount == 3){
//                break;
//            }
//        }

//        System.out.println("sum of Odd = " + sumOdd(101,101));
        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int sumEvenNum = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNUmber(number)){
                continue;
            }

            evenCount++;

            System.out.println("even number " + evenCount);
//            System.out.println("Even number " + number);
            sumEvenNum += number;

            if(evenCount == 5){
                System.out.println("sum of even numbers " + sumEvenNum);
                break;
            }

        }
        System.out.println("Total even numbers found " + evenCount);
    }

    public static boolean isEvenNUmber(int number){
        boolean retValue = false;

        if((number % 2) == 0){
            retValue = true;
        }

        return retValue;
    }

    public static int sumOdd(int start, int end){
        int retValue = -1;
        int sumValue = 0;

        if(start > end || start < 0 || end < 0){
            return retValue;
        }

        for (int i = start; i <= end; i++){
            if(isOdd(i)){
               sumValue += i;
            }
        }

        return sumValue;
    }


    public static boolean isOdd (int number){
        boolean retVal = false;

        if(number > 0 && number % 2 ==1){
            retVal = true;
        }

        return retVal;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for(int i=2; i<= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
