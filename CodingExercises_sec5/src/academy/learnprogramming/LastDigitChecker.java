package academy.learnprogramming;

public class LastDigitChecker {
    // Write a method named hasSameLastDigit with three parameters of type
    // int. Each number should be within the range of 10 (inclusive) -
    // 1000 (inclusive). If one of the numbers is not within the rante, the
    // method should return false.
    // The method should return true if at least two of the numbers share
    // the right most digit; otherwise, it should return false

    // Write another method named isValid with one parameter of type int.
    // The method needs to return true if the number parameter is in the range
    // of 10 (inclusive) - 1000 (inclusive), otherwise return false.

    public static boolean hasSameLastDigit(int val1, int val2, int val3){
        boolean errValue = false;
        boolean isAllchecked = false;

        if(!isValid(val1) || !isValid(val2) || !isValid(val3)){
            return errValue;
        }

        int lastDigit1 = val1 % 10;
        int lastDigit2 = val2 % 10;
        int lastDigit3 = val3 % 10;

        if(lastDigit1 == lastDigit2 ||  lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3){
            return true;
        }

        return errValue;

    }

    public static boolean isValid(int number){
        if(number < 10 || number > 1000){
            return false;
        }
        return true;
    }

}
