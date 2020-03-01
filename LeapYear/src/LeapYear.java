public class LeapYear {
    public static boolean isLeapYear(int year){
        boolean returnVal = false;

        if((year >= 1) && (year <= 9999)){// checking if the year is within range
            if((year % 4) == 0){//checking if the year is divisible by 4; step 1
                if((year % 100) == 0){//checking if the year is divisible by 100; step 2
                    if((year % 400) == 0){//checking if the year is divisible by 400; step 3
                        returnVal = true;
                    }
                }
                else{//step 4;
                    returnVal = true;

                }
            }
            //else use default value (false) step 5
        }
        return returnVal;
    }
}
