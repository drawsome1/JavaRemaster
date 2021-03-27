package academy.learnprogramming;

public class GreatestCommonDivisor {
    //Write a method named getGreatestCommonDivisor with two parameters of
    //type int named first and second
    //if one of the parameters is < 10, the method should return -1 to indicate
    //an invalid value.
    //The method should return the greatest common divisor of the two numbers (int)
    //The greatest common divisor is the largest postive integer that can fully divide
    //each of the integers without leaving a remainder.

    public static int getGreatestCommonDivisor(int first, int second){
        int errVal = -1;
        boolean isDone = false;
        int divisor = -1;

        // check if the values are valid
        if(first < 10 || second < 10){
            return errVal;
        }

        //determine the min of the two
        if(first < second){
            divisor = first;
        }
        else {
            divisor = second;
        }


        while(!isDone || divisor == 0){
           if(first % divisor == 0 && second % divisor == 0) {
               isDone = true;
               continue;
           }
           divisor--;
        }

        return divisor;
    }

}
