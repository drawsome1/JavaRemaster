package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        printDayOfTheWeek1(-1);
//        printDayOfTheWeek1(0);
//        printDayOfTheWeek1(1);
//        printDayOfTheWeek1(2);
//        printDayOfTheWeek1(3);
//        printDayOfTheWeek1(4);
//        printDayOfTheWeek1(5);
//        printDayOfTheWeek1(6);
//        printDayOfTheWeek2(2);

//        printNumberInWord(-1);
//        printNumberInWord(1);

        if(isLeapYear(2000)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        System.out.println(getDaysInMonth(1,-2020));
    }


    public static boolean isLeapYear(int year){
        boolean returnValue = false;

        if(year >= 1 && year <= 9999){
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                returnValue = true;
            }
        }

        return returnValue;
    }

    public static int getDaysInMonth(int month, int year){
        int returnValue = -1;

        if(month >= 1 && month <= 12 && year >= 1 && year <= 9999){
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    returnValue = 31;
                    break;
                case 2:
                    if(isLeapYear(year)){
                        returnValue = 29;
                    }else {
                        returnValue = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    returnValue = 30;
                    break;
                default:
                    returnValue = -1;
                    break;
            }
        }

        return returnValue;
    }

    public static void printNumberInWord(int number){
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
    private static void printDayOfTheWeek2(int day) {
         if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if(day ==6){
            System.out.println("Saturday");
        }else {
             System.out.println("Invalid day");
         }
    }

    private static void printDayOfTheWeek1(int day){

        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }
}
