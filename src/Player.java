public class Player {
    String name;
    int winCount;
    int loseCount;

    /**
     * Constructor for the Player class
     * @param name
     */
    public Player(String name) {
        this.name = name;
        this.winCount = 0;
        this.loseCount = 0;
    }

    /**
     * Getter for WinCount
     * @return Returns winCount
     */
    public int getWinCount() {
        return winCount;
    }

    /**
     * Sets the winCount
     * @param winCount
     */
    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    /**
     * Method to Get the LoseCount
     * @return Returns the value of LoseCount
     */
    public int getLoseCount() {
        return loseCount;
    }

    /**
     * Method to set the LoseCount
     * @param loseCount Is the LoseCount
     */
    public void setLoseCount(int loseCount) {
        this.loseCount = loseCount;
    }

    /**
     * Method to getName
     * @return Returns the value of Name
     */
    public String getName() {
        return name;
    }

    /**
     * Method to set the Name
     * @param name Sets the value of name
     */
    public void setName(String name) {
        this.name = name;
    }
}
