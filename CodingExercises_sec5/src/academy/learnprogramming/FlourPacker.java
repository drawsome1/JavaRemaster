package academy.learnprogramming;

public class FlourPacker {
    //Write a method named canPack with three parameters of type int named
    //bigCount, smallCount, and goal
    //THe parameter bigCount represents the count of big flour bags (5 kilos each)
    //The parameter smallCount represents the count of small flour bags (1 kilo each)
    //The parameter goal represents the goal amount of kilos of flor needed
    //to assemble a package.

    //Therefore, the sum of the kilos of bigCoung and smallCount must be at least
    //equal to the value of goal. The method should return true if it is possible to make
    //a package with goal kilos of flour. If the sum is greater than goal,
    //ensure that only full bags are used towards the goal amount. FOr example,
    //if goal = 9, bigCount = 2 and smallcount = 0, the method should return false
    //since each big bag is 5 kilos and cannot be divided. However, if goal = 9
    //,bigCount = 1, and smallCount = 5, the method should return true because of 1
    //full bigCount bag and 4 smallCount bags equal goal, and it's okay if there are additional
    //bags left over.

    //If any of the parameters are negative, return false.

    public static boolean canPack(int bigCount, int smallCount, int goal){
        boolean errValue = false;
        int bigKilo = 5;
        int smallKilo = 1;
        int tempGoal1 = goal;

        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return errValue;
        }

        if(goal == 0){
            return true;
        }

        //deduct bigKilo as many times as you can up until the bigCount
        for(int i = 1; i <= bigCount; i++){
            if(tempGoal1 - bigKilo >= 0){
                tempGoal1 = tempGoal1 - bigKilo;
            }
            if(tempGoal1 == 0){
                return true;
            }
        }
        //deduct smallKilo as many times as you can up until the smallCount
        for(int j = 1; j <= smallCount; j++){
            if(tempGoal1 - smallKilo >= 0){
                tempGoal1 = tempGoal1 - smallKilo;
            }
            if(tempGoal1 == 0){
                return true;
            }
        }
        return errValue;
    }

}
