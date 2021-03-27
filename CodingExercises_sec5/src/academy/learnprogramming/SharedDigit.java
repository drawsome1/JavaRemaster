package academy.learnprogramming;

public class SharedDigit {
    // write a method named hasSharedDigit with two parameters of type int
    // Each number should be within the rang of 10 (inclusive) - 99 (inclusive)
    // If one of the numbers is not within the range, the method should return
    // false.
    // The method should return true if there is a digit that appears in both
    // numbers, such as 2 in 12 and 23; otherwise, the method should return false.


    public static boolean hasSharedDigit(int val1, int val2){
        boolean errVal = false;
        int tempVal2 = val2;

        //This guarentees that both values will only have 2 digits
        if(val1 < 10 || val1 > 99 || val2 < 10 || val2 > 99){
            return errVal;
        }

        int digitToCheck1 = -1;
        int digitToCheck2 = -1;


        while(val1 != 0){
            digitToCheck1 = val1 % 10;


            //reset inner loop
            tempVal2 = val2;
            while(tempVal2 != 0){
                digitToCheck2 = tempVal2 % 10;

                if(digitToCheck1 == digitToCheck2){
                    return true;
                }
                tempVal2 = tempVal2 / 10;
            }
            //removes the least significant digit
            val1 = val1 / 10;

        }

        return errVal;
    }
}
