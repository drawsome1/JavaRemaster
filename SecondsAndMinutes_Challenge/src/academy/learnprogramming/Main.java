package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //getDurationString(60,59);
        System.out.println(getDurationString(5000));

        System.out.println(getDurationString(61,0));

    }

    public static String getDurationString(long minutes, long seconds){
        //variables
        int minToHr = 60;

        if((minutes < 0) || (seconds < 0) || (seconds > 59)){
            return "Invalid value";
        }
        long hours = (minutes / minToHr);
        String hourString = hours + "h";

        long remainingMin = (minutes % minToHr);
        String minString = remainingMin + "m";

        String secString = seconds + "s";


        if(hours < 10){
            hourString = "0" + hourString;
        }

        if(remainingMin < 10){
            minString= "0" + minString;
        }

        if(seconds < 10){
           secString = "0" + secString;
        }

        return hourString + " " + minString + " " + secString;
    }

    public static String getDurationString(long seconds) {
        int secToMin = 60;
        if(seconds < 0){
            return "Invalid value";
        }

        long min = (seconds / secToMin);
        long remainSec = (seconds % secToMin);

        return getDurationString(min, remainSec);

    }

}
