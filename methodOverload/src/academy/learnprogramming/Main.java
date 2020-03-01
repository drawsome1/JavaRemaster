package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(0,13);
        System.out.println("Number of centimeters = " + centimeters);

        centimeters = calcFeetAndInchesToCentimeters(157);
        System.out.println("Number of centimeters = " + centimeters);


        centimeters = calcFeetAndInchesToCentimeters(7,5) ;
        System.out.println("Number of centimeters = " + centimeters);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double ftToIn = 12d;
        double inToCm = 2.54d;


        if(feet >= 0){
           if((inches >= 0) && (inches <= 12)) {
               return (((feet * ftToIn) + inches) * inToCm);

           }
        }

        return -1d;

    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        double intoFt = 12;
        if(inches >= 0){
            return calcFeetAndInchesToCentimeters((int)(inches / intoFt),(int)(inches % intoFt));

        }
        return -1d;
    }

}
