package academy.learnprogramming;

public class DiagonalStar {
    //Write a method named printSquareStar with one parameter of type int named number
    //if number is < 5, the method should print "Invalid Value"

    //The method should print diagonals to generate a retangular pattern composed of stars (*)
    //This should be accomplished by using loops

    //Stars are printed with the following conditions:
    //In the first or last row
    //In the first or last column
    //when the row number equals the column number
    //when the column number equals rowCount - currentRow + 1

    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
            return;
        }
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){
                if(i == 1 || i == number){
                    System.out.print('*');
                }
                else if(j == 1 || j == number){
                    System.out.print('*');
                }
                else if(i == j){
                    System.out.print('*');
                }
                else if(j == (number - i + 1)){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }

                //go to the next line
                if(j == number){
                    System.out.println("");
                }
            }

        }

    }
}
