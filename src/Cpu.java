public class Cpu extends Player {
    int winCount;
    int loseCount;

    /**
     * Constructor for the CPU class
     * @param name Is Cpu's name.
     */
    public Cpu(String name) {
        super(name);
    }

    /**
     * Method to get the value from loseCount
     * @return returns the Value of LoseCount
     */
    @Override
    public int getLoseCount() {
        return loseCount;
    }

    /**
     * Method to set the value of LoseCount
     * @param loseCount Is the LoseCount
     */
    @Override
    public void setLoseCount(int loseCount) {
        this.loseCount = loseCount;
    }

    /**
     * Method to get the value of WinCount
     * @return Returns the value of WinCount
     */
    @Override
    public int getWinCount() {
        return winCount;
    }

    /**
     * Method to set the WinCount value
     * @param winCount Is the value of WinCount
     */
    @Override
    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }
}
