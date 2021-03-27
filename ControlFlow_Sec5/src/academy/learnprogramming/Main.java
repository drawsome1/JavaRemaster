package academy.learnprogramming;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        char testCharValue = 'E';

        switchTest('E');

    }

    public static void switchTest(char testvalue){
        switch(testvalue){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            case 'D':
                System.out.println("D was found");
                break;
            case 'E':
                System.out.println("E was found");
                break;
            default:
                System.out.println("value not found");
                break;
        }
    }
}
