package CardGame;

import java.util.Scanner;

public class Snap extends CardGame{
    private Player player1;
    private Player player2;
    private int currentPlayerTurn;


    public Snap(){
        this.player1 = new Player("Player 1");
        this.player2 = new Player("Player 2");
        this.currentPlayerTurn = 0;
    }

    private Player getPlayer(){
        if(currentPlayerTurn == 0){
            return player1;
        }  else {
            return player2;
        }
    }

    private void swapPlayerTurn(){
        currentPlayerTurn = 1 - currentPlayerTurn;
    }

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
                System.out.println("TYPE SNAP TO WIN!");
                long snapStart = System.currentTimeMillis();
                String inputSnap = scanner.nextLine();
                System.out.println(snapStart);

                if (System.currentTimeMillis() - snapStart <= 2000 && inputSnap.equalsIgnoreCase("snap")){
                    System.out.println(player1.getName() + "WINS!");
                }


            }
            previousCard = currentCard;
        }
        
    }
}
