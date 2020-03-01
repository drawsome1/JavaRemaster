public class TeenNumberChecker {
    public static boolean hasTeen (int value1, int value2, int value3){

        if((value1 >= 13) && (value1 <= 19)){
            return true;
        }

        if((value2 >= 13) && (value2 <= 19)){
            return true;
        }

        if((value3 >= 13) && (value3 <= 19)){
            return true;
        }

        return false;
    }

    public static boolean isTeen(int value1){

        if((value1 >= 13) && (value1 <= 19)){
            return true;
        }
        return false;
    }
}
