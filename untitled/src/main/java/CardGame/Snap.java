package CardGame;

import java.util.Scanner;

public class Snap extends CardGame{
    private Player player1;
    private Player player2;
    private int currentPlayerTurn;


    @Override
    public void playGame(){
        Scanner scanner = new Scanner(System.in);
        Card currentCard;
        Card previousCard = null;

        while (!deckOfCards.isEmpty()) {
            scanner.nextLine();
            currentCard = dealCard();
            System.out.println("Drawn Card = " + currentCard);


            if (previousCard != null && currentCard.getSymbol().equals(previousCard.getSymbol())) {
                System.out.println("Winner!");
                break;
            }
            previousCard = currentCard;
        }
        
    }
}
