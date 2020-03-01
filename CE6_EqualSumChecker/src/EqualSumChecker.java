public class EqualSumChecker {
    public static boolean hasEqualSum(int part1, int part2, int sum){
        boolean returnVal = false;
        if((part1 + part2) == sum){
            returnVal = true;
        }
       return returnVal;
    }
}
