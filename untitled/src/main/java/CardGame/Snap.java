package CardGame;

import java.util.Scanner;

public class Snap extends CardGame{


    @Override
    public void playGame(){
        Scanner scanner = new Scanner(System.in);
        Card currentCard;

        scanner.nextLine();
        currentCard = dealCard();
        System.out.println("Drawn Card = " + currentCard);
    }
}
