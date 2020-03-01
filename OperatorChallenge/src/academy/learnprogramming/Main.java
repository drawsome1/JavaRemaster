package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        double doubleVariable1 = 20d;
        double doubleVariable2 = 80d;

        double result1 = (doubleVariable1 + doubleVariable2) * 100d;

        double result2 = (result1 % 40d);

        boolean isRemainder0 = (result2 == 0d) ? true : false;

        System.out.println(isRemainder0);

        if(!isRemainder0){
            System.out.println("Got some remainder");
        }



    }
}
