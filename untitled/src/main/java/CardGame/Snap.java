package CardGame;

import java.util.Scanner;

public class Snap extends CardGame{


    @Override
    public void playGame(){
        Scanner scanner = new Scanner(System.in);
        Card currentCard;
        Card previousCard = null;

        while (!deckOfCards.isEmpty()) {
            scanner.nextLine();
            currentCard = dealCard();
            System.out.println("Drawn Card = " + currentCard);


            if (currentCard.getSymbol().equals(previousCard.getSymbol())) {
                System.out.println("Winner!");
                break;
            }
            previousCard = currentCard;
        }
        
    }
}
