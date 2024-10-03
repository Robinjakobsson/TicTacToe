
import java.util.*;

/**
 * Class to keep track of the game panel.
 */
public class Game extends MenuMethods {
    Scanner scanner = new Scanner(System.in);
    MenuMethods menu = new MenuMethods();
    boolean isRunning = true;


    /**
     * Method to call in main
     */
    public void start() {
        Player player = new Player("Robin the great");
        Cpu cpu = new Cpu("Third grade Student");

        while (isRunning) {

            System.out.println("1. New Game");
            System.out.println("2. Instructions");
            System.out.println("3. Exit");
            System.out.println("4. Check scores");
            int menuInput = scanner.nextInt();

            switch (menuInput) {
                case 1:
                    boolean gameActive = true;
                        char[][] gameBoard = {{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',},
                                {' ', '-', ' ', '|', ' ', '-', ' ', '|', ' ', '-',},
                                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',},
                                {' ', '-', ' ', '|', ' ', '-', ' ', '|', ' ', '-', ' ',},
                                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',},
                                {' ', '-', ' ', '|', ' ', '-', ' ', '|', ' ', '-', ' ',}};
                        printBoard(gameBoard);
                        while (gameActive){
                        System.out.println("Enter a placement (1-9)");
                        int pos = scanner.nextInt();

                        while (!checkValid(pos, gameBoard)) {
                            System.out.println("Not valid move...");
                            pos = scanner.nextInt();
                        }
                            placement(pos,gameBoard,player);

                        if (menu.checkWinner(gameBoard, 'X')){
                            System.out.println(player.name + " Wins!");
                            gameActive = false;
                            player.setWinCount(player.getWinCount()+ 1);
                            cpu.setLoseCount(cpu.getLoseCount()+ 1);
                            break;
                        }
                        Random random = new Random();
                        int enemyPos = random.nextInt(1,10);
                        while (!checkValid(enemyPos,gameBoard)) {
                                enemyPos = random.nextInt(1,10);
                            }
                        placement(enemyPos,gameBoard,cpu);

                        if (checkWinner(gameBoard, 'O')){
                            System.out.println("CPU wins");
                            cpu.setWinCount(cpu.getWinCount() + 1);
                            player.setLoseCount(player.getLoseCount() + 1);
                            gameActive = false;
                        }
                        if (isBoardFull(gameBoard)){
                            System.out.println("it's a tie!");{
                                gameActive = false;
                            }
                        }
                        }
                    break;
                case 2:
                    menu.exampleBoard();
                    break;

                case 3:
                    isRunning = false;
                    break;
                case 4:
                    System.out.println(player.getName()+ " Stats");
                    System.out.println("Wins: "+player.getWinCount());
                    System.out.println("Losses: "+player.getLoseCount());
                    System.out.println();
                    System.out.println(cpu.getName() + " Stats");
                    System.out.println("Wins: "+cpu.getWinCount());
                    System.out.println("Losses: "+cpu.getLoseCount());
            }
        }
    }
}