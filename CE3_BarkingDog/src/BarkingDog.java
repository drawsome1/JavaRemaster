public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean isTimeToWake = false;
        if((barking) && (hourOfDay >= 0) && (hourOfDay <= 23)) {
            if((hourOfDay < 8) || (hourOfDay > 22)){
                isTimeToWake = true;
            }

        }

        return isTimeToWake;
    }
}