package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;


        System.out.println("Integer minimum Value = " + myMinIntValue);
        System.out.println("Integer minimum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 9));


        int myMaxIntTest = 2147483647 ;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Minimum Value = " + myMaxByteValue);

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Minimum Value = " + myMaxShortValue);
        
        
        long myLongValue = 100L;


        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Minimum Value = " + myMaxLongValue);
        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte)(myMinByteValue /2);

        short myNewShortValue = (short)(myMinShortValue /2);
    }
}
