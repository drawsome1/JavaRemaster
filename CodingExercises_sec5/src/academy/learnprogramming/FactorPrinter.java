package academy.learnprogramming;

public class FactorPrinter {
    //write a method named printFactors with one parameter of type int
    //named number. If number < 1, the method should print "Invalid Value"
    //The method should print all factors of the number. A factor of a number
    //is an integer which divides that number wholly without a remainder
    //For example, 3 is a factor of 6 beacuse 3 fully divides without leaving
    //a remainder. IN other words 6/3 = 2

    public static void printFactors(int number){
        int testFactor = 1;

        if(number < 0){
            System.out.println("Invalid Value");
            return;
        }
        while(testFactor <= number){

            if(number % testFactor == 0){
                System.out.println(testFactor);
            }
            testFactor++;
        }
    }
}
