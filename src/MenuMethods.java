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
    }
}
