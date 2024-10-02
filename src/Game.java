
import java.util.Scanner;

/**
 * Class to keep track of the game panel.
 */
public class Game extends MenuMethods {
    Scanner scanner = new Scanner(System.in);
    MenuMethods menu = new MenuMethods();
    boolean isRunning = true;


    public void start() {

        while (isRunning) {
            Player player = new Player("Robin the great");
            Cpu cpu = new Cpu("Third grade Student");

            System.out.println("1. New Game");
            System.out.println("2. Instructions");
            System.out.println("3. Exit");
            int menuInput = scanner.nextInt();

            switch (menuInput) {
                case 1:
                    char[][] gameBoard = {{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',},
                            {' ', '-', ' ', '|', ' ', '-', ' ', '|', ' ', '-',},
                            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',},
                            {' ', '-', ' ', '|', ' ', '-', ' ', '|', ' ', '-', ' ',},
                            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',},
                            {' ', '-', ' ', '|', ' ', '-', ' ', '|', ' ', '-', ' ',}};
                    printBoard(gameBoard);

                    System.out.println("Enter a placement (1-9)");
                    int pos = scanner.nextInt();
                    placement(pos, gameBoard, player);

                    break;
                case 2:
                    menu.exampleBoard();
                    break;

                case 3:
                    isRunning = false;
                    break;
            }
        }
    }


    /**
     * Method to print the GameBoard
     * @param gameBoard is the GameBoard that is being passed through
     */
    public void printBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    /**
     * Method to place an X or an O
     * @param pos is the position of on the board
     * @param gameBoard is the GameBoard
     */
    public void placement(int pos, char[][] gameBoard, Player player) {
        char symbol = 'x';
        if (player instanceof Cpu)
            symbol = 'O';

            switch (pos) {
                case 1:
                    gameBoard[1][1] = symbol;
                    printBoard(gameBoard);
                    break;
                case 2:
                    gameBoard[1][5] = symbol;
                    printBoard(gameBoard);
                    break;
                case 3:
                    gameBoard[1][9] = symbol;
                    printBoard(gameBoard);
                    break;
                case 4:
                    gameBoard[3][1] = symbol;
                    printBoard(gameBoard);
                    break;
                case 5:
                    gameBoard[3][5] = symbol;
                    printBoard(gameBoard);
                    break;
                case 6:
                    gameBoard[3][9] = symbol;
                    printBoard(gameBoard);
                    break;
                case 7:
                    gameBoard[5][1] = symbol;
                    printBoard(gameBoard);
                    break;
                case 8:
                    gameBoard[5][5] = symbol;
                    printBoard(gameBoard);
                    break;
                case 9:
                    gameBoard[5][9] = symbol;
                    printBoard(gameBoard);
                    break;

            }



    }

}