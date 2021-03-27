package academy.learnprogramming;

public class NumberToWords {
    //Write a method called numberToWords with one int parameter named
    //number. The method should print out the passed number using words
    //for the digits. If the number is negative, print "Invalid Value"

    //To Print the number as words, follow these steps:
    // 1. Extract the last digit of the given number using the remainder operator
    // 2. Convert the value of the digit found in step 1 into a word. Possible 10 digits
    // 3. remove the last digit from the number.
    // 4. Repeat steps 2 through 4 untile the number is 0.

    //write a second method to reverse the order called reverse
    //the method reverse should have one int parameter and return the
    //reversed number int, it can reverse negative numbers

    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
            return;
        }


        int tempNum = reverse(number);
        int digit = 0;
        String numberToWord = "";
        int numDigits = getDigitCount(number);

        while(tempNum != 0){
           digit = tempNum % 10;

           switch (digit){
               case 0:
                   numberToWord = numberToWord + " Zero";
                   numDigits--;
                   break;
               case 1:
                   numberToWord = numberToWord + " One";
                   numDigits--;
                   break;
               case 2:
                   numberToWord = numberToWord + " Two";
                   numDigits--;
                   break;
               case 3:
                   numberToWord = numberToWord + " Three";
                   numDigits--;
                   break;
               case 4:
                   numberToWord = numberToWord + " Four";
                   numDigits--;
                   break;
               case 5:
                   numberToWord = numberToWord + " Five";
                   numDigits--;
                   break;
               case 6:
                   numberToWord = numberToWord + " Six";
                   numDigits--;
                   break;
               case 7:
                   numberToWord = numberToWord + " Seven";
                   numDigits--;
                   break;
               case 8:
                   numberToWord = numberToWord + " Eight";
                   numDigits--;
                   break;
               case 9:
                   numberToWord = numberToWord + " Nine";
                   numDigits--;
                   break;
               default:
                   numberToWord = numberToWord;
                   break;
           }

           tempNum = tempNum / 10;
        }

        for(int i = 0; i < numDigits; i++ ){
            numberToWord = numberToWord + " Zero";
        }



        System.out.println(numberToWord);
    }

    public static int reverse(int number){
        if(number / 10 == 0){
            return number;
        }

        int tempVal = number;
        int digit = tempVal % 10;
        int reverseVal = 0;


        while(tempVal != 0){
            reverseVal = (reverseVal * 10) + digit;
            tempVal = tempVal / 10;
            digit = tempVal % 10;
        }

        return reverseVal;
    }

    public static int getDigitCount(int number){
        int errValue = -1;
        int numDigits = 0;
        if(number < 0){
            return errValue;
        }
        if(number < 10){
            return 1;
        }

        while(number != 0){
            numDigits++;
            number = number / 10;

        }

        return numDigits;
    }
}
