import CardGame.CardGame;

public class main {
    public static void main(String[] args){
        CardGame game = new CardGame();
        game.shuffleDeck();
        game.getDeck();
        System.out.println("SORTING DECK");
        game.sortDeckIntoSuits();
        game.getDeck();
        System.out.println("SORTING DECK");
        game.sortDeckInNumberOrder();
        game.getDeck();
//        System.out.println(game.dealCard());
    }
}
