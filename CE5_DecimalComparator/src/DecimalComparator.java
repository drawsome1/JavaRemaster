public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double lhs, double rhs){
        boolean returnVal = false;
        if((int)(lhs *1000) == (int)(rhs *1000)){
            returnVal = true;
        }
        return returnVal;
    }
}
