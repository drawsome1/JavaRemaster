package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(sumDigits(888));
//        int number = 11212;
//        if(isPalindrome(number)){
//            System.out.println(number + " is a palindrome");
//        }
//        else{
//            System.out.println(number + " is not a palindrome");
//        }
        int val = 25897;
        System.out.println("sum of first and last of " + val + " is " + sumFirstAndLastDigit(val));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int sum = (number % 10);
        int tempVal = number;

        do {

            if(tempVal /10 == 0){
                sum += tempVal;
            }
            tempVal = tempVal / 10;
        }
        while(tempVal != 0);

        return sum;
    }
    public static boolean isPalindrome(int number){
        boolean retValue = false;
        int tempNum = number;
        int reverseNum = 0;

        while(tempNum != 0){
            reverseNum = (reverseNum * 10) + (tempNum % 10);
            tempNum = tempNum / 10;
        }

        if(reverseNum == number){
            retValue = true;
        }

        return retValue;
    }

    public static int sumDigits(int number){
        int errValue = -1;
        int tempValue = number;
        int sumValue = 0;


        if(number < 10) {
            return errValue;
        }

        while(tempValue != 0){
            sumValue = sumValue + (tempValue%10);
            tempValue = tempValue/10;
        }
        return sumValue;

    }
}
