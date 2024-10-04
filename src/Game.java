import java.util.*;

/**
 * Class to keep track of the game panel.
 */
public class Game extends Methods {
    Scanner scanner = new Scanner(System.in);
    Methods methods = new Methods();
    boolean isRunning = true;

    /**
     * Method to call in main
     */
    public void start() {
        Player player = new Player("Robin the great");
        Cpu cpu = new Cpu("Third grade Student");
        TwoPlayerMethods tpMethods = new TwoPlayerMethods();

        while (isRunning) {
            methods.menu();
            int menuInput = 0;

            try{
                menuInput = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Invalid input. please enter a number");
                scanner.nextLine();
                   }

            switch (menuInput) {
                case 1:
                    gameStart(player,cpu);
                    break;
                case 2:
                    tpMethods.twoPlayer();
                    break;
                case 3:
                    exampleBoard();
                    break;
                case 4:
                    printStats(player,cpu);
                    break;
                case 5:
                    isRunning = false;
                    break;

                case 6:
                    break;

                default:
                    break;
                }
          }
    }
}