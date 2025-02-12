import CardGame.CardGame;

public class main {
    public static void main(String[] args){
        CardGame game = new CardGame();
        game.shuffleDeck();
        game.getDeck();
        System.out.println(game.dealCard());
    }
}
