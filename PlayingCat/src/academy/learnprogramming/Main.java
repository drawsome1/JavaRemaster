package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        if(isCatPlaying(false,35)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean isPlaying = false;

        if (summer && temperature >= 25 && temperature <= 45)
        {
            isPlaying = true;
        }
        else if (!summer && temperature >= 25 && temperature <= 35)
        {
            isPlaying = true;
        }

        return isPlaying;
    }
}
