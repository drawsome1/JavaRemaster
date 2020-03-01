package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte bytePart = 1;
        short shortPart = 1;
        int intPart = 1;
        long longPart = 50000 + (10 * (bytePart + shortPart + intPart));

        System.out.println(longPart);


    }
}
