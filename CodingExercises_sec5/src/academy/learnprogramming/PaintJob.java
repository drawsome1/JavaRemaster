package academy.learnprogramming;

public class PaintJob {
    //Bob is a wall painter and he needs your help. You have to write a program that helps
    //bob calculate how many buckets of paint he needs to buy before going to work. Bob
    //might also have some extra buckets at home. He also knows the area that he can cover
    //with one bucket of paint.

    //1. Write a method named getBucketCount with 4 parameters.
        //1) width of type double //width of the wall
        //2) height of type double // height of the wall
        //3) areaPerBucket  of type double// the area that can be convered with one bucket of paint
        //4) extraBuckets int //represents the bucket count that bob has at home

    //The method needs to return a value of type int that represents the number of buckets
    //that Bob needs to buy before going to work. To calcualte the bucket count, refer to the notes

    //If one of the paremeters width, height, or areaPerBucket is less than or equal to 0, or
    //if extraBuckets is less than 0, the method needs to return -1 to indicate an invalid value

    //If all parameters are valid, the method needs to calculate the number of buckets and return it

    //2.Also create an overloaded method without the extraBuckets parameter

    //3. In some cases, Bob does not know the width and height of the wall but he knows the area
        //of a wall. He needs you to write another method.
        //Write another overloaded method with 2 parameters area and areaPerBucket (both type double)
        //The method needs to return a value of type int that represents the number of buckets that
        //bob needs to buy before going to work

    //Note: use Math.ceil to round to the number of calculated buckets then convert it into an int
    //before returning the value from the methods

    public static int getBucketCount(double area, double areaPerBucket){
        //area is width * height so I can hardcode 1 to either the width or height if area is known
        return getBucketCount(area,1,areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        int errVal = -1;

        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0 || extraBuckets < 0.0){
            return errVal;
        }

        double areaOfWall = width * height;
        double extraPaintArea = extraBuckets * areaPerBucket;
        double bucketsNeeded = 0;

        double remainingArea = areaOfWall - extraPaintArea;

        bucketsNeeded = Math.ceil(remainingArea/areaPerBucket);

        return (int) bucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width, height, areaPerBucket, 0);
    }

}
