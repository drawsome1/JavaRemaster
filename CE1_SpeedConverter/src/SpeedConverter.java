public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        long returnValue = -1L; //default value to return
        double kmTomRate = 1.609;

        if (kilometersPerHour >= 0){
            returnValue = Math.round((kilometersPerHour / kmTomRate));
        }

        return returnValue;
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else {

            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

}
