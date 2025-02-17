import CardGame.CardGame;
import CardGame.*;

public class main {
    public static void main(String[] args){
        Snap game = new Snap();
        game.shuffleDeck();
        game.playGame();
    }
}
