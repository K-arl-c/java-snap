package CardGame;

public class Player {
    private String name;
    private boolean hasWon;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isHasWon() {
        return hasWon;
    }

    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int score;


    public Player(String  name){
        this.name = name;
        this.hasWon = false;
        this.score = 0;
    }
    @Override
    public String toString(){
        return name;
    }


//    NEEDED FOR PLAYER CLASS
//    NAME?
//    SCORE
//    HAS WON
//
}
