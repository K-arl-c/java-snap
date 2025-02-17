import CardGame.CardGame;
import CardGame.*;

public class main {
    public static void main(String[] args){
        Snap game = new Snap();
//        Snap game = new CardGame();
        game.shuffleDeck();
//        game.getDeck();
//        System.out.println("SORTING DECK");
//        game.sortDeckIntoSuits();
//        game.getDeck();
//        System.out.println("SORTING DECK");
//        game.sortDeckInNumberOrder();
//        game.getDeck();
//        System.out.println(game.dealCard());

        game.playGame();
    }
}
