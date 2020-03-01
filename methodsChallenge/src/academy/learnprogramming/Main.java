package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String player1 = "Squirel";
        String player2 = "Peanuts";
        String player3 = "Whaaat";
        String player4 = "You";

        int score;
        //player1 score
        score = calculateHighScorePosition(1500);
        if(score != -1) {
            displayHighScorePosition(player1, score);
        }

        //player2 score
        score = calculateHighScorePosition(900);
        if(score != -1) {
            displayHighScorePosition(player2, score);
        }

        //player3 score
        score = calculateHighScorePosition(400);
        if(score != -1) {
            displayHighScorePosition(player3, score);
        }

        //player 4 score
        score = calculateHighScorePosition(50);
        if(score != -1) {
            displayHighScorePosition(player4, score);
        }


    }

    public static void displayHighScorePosition(String player, int scorePosition){
        System.out.println(player + " managed to get into position " + scorePosition
            + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        int returnVal = -1;
        if(playerScore >= 1000){
            returnVal = 1;
        }
        else if((playerScore >= 500) && (playerScore < 1000)){
            returnVal = 2;
        }
        else if((playerScore >= 100) && (playerScore < 500)){
            returnVal = 3;
        }
        else {
            returnVal = 4;
        }

        return  returnVal;

    }
}
