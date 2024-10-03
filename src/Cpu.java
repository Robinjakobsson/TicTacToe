public class Cpu extends Player {
    int winCount;
    int loseCount;

    public Cpu(String name) {
        super(name);
    }

    @Override
    public int getLoseCount() {
        return loseCount;
    }

    @Override
    public void setLoseCount(int loseCount) {
        this.loseCount = loseCount;
    }

    @Override
    public int getWinCount() {
        return winCount;
    }

    @Override
    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }
}
