public class Main {

    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);
        int highScore = 50;

        if (highScore == 50) {
            System.out.println("This is an expression");
        }


        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;
        }
        //
        /*
         * Expressions:
         * the score = 100
         * score > 99
         * "You got the high score!
         * score = 0;
         * */


        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");


    }
}
