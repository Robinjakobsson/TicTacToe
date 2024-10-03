public class Player {
    String name;
    int winCount;
    int loseCount;


    public Player(String name) {
        this.name = name;
        this.winCount = 0;
        this.loseCount = 0;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public int getLoseCount() {
        return loseCount;
    }

    public void setLoseCount(int loseCount) {
        this.loseCount = loseCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int Wincounter(){
        return this.winCount++;
    }
    public int loseCounter(){
        return this.loseCount++;
    }
}
