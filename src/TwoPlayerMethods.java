import java.util.Scanner;

public class TwoPlayerMethods extends Methods {
    Scanner scanner = new Scanner(System.in);


    public void twoPlayer(){
        System.out.println("Player one: Enter name");
        String name = scanner.next();
        System.out.println("Player two: Enter name");
        String nameTwo = scanner.next();

        Player player = new Player(name);
        Player playerTwo = new Player(nameTwo);

        tpGameStart(player,playerTwo);
    }

    /**
     * Method to start the TwoPlayerMode
     * @param player = First player
     * @param playerTwo = Second Player
     */

    public void tpGameStart(Player player, Player playerTwo){
        boolean gameActive = true;
        char[][] gameBoard = {{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',},
                {' ', '-', ' ', '|', ' ', '-', ' ', '|', ' ', '-',},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',},
                {' ', '-', ' ', '|', ' ', '-', ' ', '|', ' ', '-', ' ',},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',},
                {' ', '-', ' ', '|', ' ', '-', ' ', '|', ' ', '-', ' ',}};
        printBoard(gameBoard);

        while (gameActive) {
            try {

            System.out.println(player.getName()+" Enter a placement (1-9)");
                int pos = scanner.nextInt();

                while (!checkValid(pos, gameBoard)) {
                    System.out.println("Not valid move...");
                    pos = scanner.nextInt();
                }
                tpPlacement(pos,gameBoard, 'X');

                if (checkWinner(gameBoard, 'X')) {
                    System.out.println(player.name + " Wins!");
                    gameActive = false;
                    player.setWinCount(player.getWinCount() + 1);
                    playerTwo.setLoseCount(playerTwo.getLoseCount() + 1);
                    break;
                }
                System.out.println(playerTwo.getName() +  " Enter a placement (1-9)");
                int enemyPos = scanner.nextInt();
                while (!checkValid(enemyPos, gameBoard)) {

                }
                tpPlacement(enemyPos,gameBoard,'O');

                if (checkWinner(gameBoard, 'O')) {
                    System.out.println("Player two wins!");
                    playerTwo.setWinCount(playerTwo.getWinCount() + 1);
                    player.setLoseCount(player.getLoseCount() + 1);
                    gameActive = false;
                }
                if (isBoardFull(gameBoard)) {
                    System.out.println("it's a tie!");
                    {
                        gameActive = false;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error.");
                scanner.nextLine();
            }
        }
        printStats(player,playerTwo);
    }


    public void tpPlacement(int pos, char[][] gameBoard,char marker) {
        switch (pos) {
            case 1:
                gameBoard[1][1] = marker;
                printBoard(gameBoard);
                break;
            case 2:
                gameBoard[1][5] = marker;
                printBoard(gameBoard);
                break;
            case 3:
                gameBoard[1][9] = marker;
                printBoard(gameBoard);
                break;
            case 4:
                gameBoard[3][1] = marker;
                printBoard(gameBoard);
                break;
            case 5:
                gameBoard[3][5] = marker;
                printBoard(gameBoard);
                break;
            case 6:
                gameBoard[3][9] = marker;
                printBoard(gameBoard);
                break;
            case 7:
                gameBoard[5][1] = marker;
                printBoard(gameBoard);
                break;
            case 8:
                gameBoard[5][5] = marker;
                printBoard(gameBoard);
                break;
            case 9:
                gameBoard[5][9] = marker;
                printBoard(gameBoard);
                break;

        }
    }

    /**
     * Identical method to print stats but for 2 players
     * @param player is Player one
     * @param playerTwo is Player Two
     */
    public void printStats(Player player, Player playerTwo){
        System.out.println(player.getName() + " Stats");
        System.out.println("Wins: " + player.getWinCount());
        System.out.println("Losses: " + player.getLoseCount());
        System.out.println();
        System.out.println(playerTwo.getName() + " Stats");
        System.out.println("Wins: " + playerTwo.getWinCount());
        System.out.println("Losses: " + playerTwo.getLoseCount());
    }
}
