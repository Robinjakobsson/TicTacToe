public class MenuMethods {
    /**
     * Displays the board to instruct the player how to
     * Place an X correctly.
     */
    public void exampleBoard() {
        char[][] exampleBoard = {{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',},
                {' ', '1', ' ', '|', ' ', '2', ' ', '|', ' ', '3',},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',},
                {' ', '4', ' ', '|', ' ', '5', ' ', '|', ' ', '6', ' ',},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',},
                {' ', '7', ' ', '|', ' ', '8', ' ', '|', ' ', '9', ' ',}};

        for (char[] row : exampleBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println("The game is played on a grid that's 3 squares by 3 squares");
        System.out.println("You are 'X', The computer is 'O' You take turns putting your marks");
        System.out.println("The first player to get 3 of their marks in a row wins!");
    }

    /**
     *
     * @param pos is the chosen position
     * @param gameBoard is the GameBoard
     * @return True if the move is doable.
     */
    public boolean checkValid (int pos, char[][] gameBoard) {
        switch (pos){
            case 1: return gameBoard[1][1] == '-';
            case 2: return gameBoard[1][5] == '-';
            case 3: return gameBoard[1][9] == '-';
            case 4: return gameBoard[3][1] == '-';
            case 5: return gameBoard[3][5] == '-';
            case 6: return gameBoard[3][9] == '-';
            case 7: return gameBoard[5][1] == '-';
            case 8: return gameBoard[5][5] == '-';
            case 9: return gameBoard[5][9] == '-';

            default: return false;
        }
    }

    /**
     *
     * @param gameBoard is the GameBoard
     * @return True if board is full
     */
    public boolean isBoardFull(char[][] gameBoard){
        for (char[] row : gameBoard){
            for (char c : row){
                if (c == '-'){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Method to place an X or an O
     * @param pos is the position of on the board
     * @param gameBoard is the GameBoard
     */
    public void placement(int pos, char[][] gameBoard, Player player) {

        char symbol = 'X';
        if (player instanceof Cpu){
            symbol = 'O';}

        switch (pos) {
            case 1:
                gameBoard[1][1] = symbol;
                if (player instanceof Cpu) {
                    printBoard(gameBoard);
                }
                break;
            case 2:
                gameBoard[1][5] = symbol;
                if (player instanceof Cpu) {
                    printBoard(gameBoard);
                }
                break;
            case 3:
                gameBoard[1][9] = symbol;
                if (player instanceof Cpu) {
                    printBoard(gameBoard);
                }
                break;
            case 4:
                gameBoard[3][1] = symbol;
                if (player instanceof Cpu) {
                    printBoard(gameBoard);
                }
                break;
            case 5:
                gameBoard[3][5] = symbol;
                if (player instanceof Cpu) {
                    printBoard(gameBoard);
                }
                break;
            case 6:
                gameBoard[3][9] = symbol;
                if (player instanceof Cpu) {
                    printBoard(gameBoard);
                }
                break;
            case 7:
                gameBoard[5][1] = symbol;
                if (player instanceof Cpu) {
                    printBoard(gameBoard);
                }
                break;
            case 8:
                gameBoard[5][5] = symbol;
                if (player instanceof Cpu) {
                    printBoard(gameBoard);
                }
                break;
            case 9:
                gameBoard[5][9] = symbol;
                if (player instanceof Cpu) {
                    printBoard(gameBoard);
                }
                break;

        }
    }

    /**
     *  Method to Prints out the GameBoard
     * @param gameBoard is the GameBoard
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
     *
     * @param gameBoard is the updated GameBoard
     * @param symbol is the Symbol of the CPU and the user
     * @return True if someone has these combinations
     */

    public boolean checkWinner(char[][] gameBoard, char symbol){
        return (gameBoard[1][1] == symbol && gameBoard[1][5] == symbol && gameBoard[1][9] == symbol) ||
                (gameBoard[3][1] == symbol && gameBoard[3][5] == symbol && gameBoard[3][9] == symbol) ||
                (gameBoard[5][1] == symbol && gameBoard[5][5] == symbol && gameBoard[5][9] == symbol) ||
                (gameBoard[1][1] == symbol && gameBoard[3][1] == symbol && gameBoard[5][1] == symbol) ||
                (gameBoard[1][5] == symbol && gameBoard[3][5] == symbol && gameBoard[5][5] == symbol) ||
                (gameBoard[1][9] == symbol && gameBoard[3][9] == symbol && gameBoard[5][9] == symbol) ||
                (gameBoard[1][1] == symbol && gameBoard[3][5] == symbol && gameBoard[5][9] == symbol) ||
                (gameBoard[1][9] == symbol && gameBoard[3][5] == symbol && gameBoard[5][1] == symbol);

    }
}
