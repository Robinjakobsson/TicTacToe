import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    public void start(){
        char [][] gameBoard = { {'-','-','-','-','-','-','-','-','-','-','-',},
                {' ','-',' ','|',' ','-',' ','|',' ','-',},       
                {'-','-','-','-','-','-','-','-','-','-','-',},   
                {' ', '-', ' ','|',' ','-',' ','|',' ','-',' ',}, 
                {'-','-','-','-','-','-','-','-','-','-','-',},   
                {' ', '-', ' ','|',' ','-',' ','|',' ','-',' ',}};
        printBoard(gameBoard);

        System.out.println("Enter a placement (1-9)");
        int pos = scanner.nextInt();
        
        switch (pos){
            case 1:
                gameBoard[1][1] = 'X';
                printBoard(gameBoard);
                break;
        }


    }

    /**
     * Method to print the Gameboard
     * @param gameBoard is the gameboard that is being passed through
     */
    public void printBoard (char [][] gameBoard){
        for (char[] row : gameBoard){
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

