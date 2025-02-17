package Commands;

import CardGame.Snap;

import java.util.Scanner;

public class MenuCommands {
    private Snap snapGame;
    private Scanner scanner;

    public MenuCommands(Snap snapGame){
        this.snapGame = snapGame;
        this.scanner = new Scanner(System.in);
        snapGame.shuffleDeck();
    }


    public void setPlayerNames(){
        System.out.println("Player 1, what is your name?");
        String p1 = scanner.nextLine();
        System.out.println("Player 2, what is your name?");
        String p2 = scanner.nextLine();

        snapGame.setPlayerName(p1,p2);
        System.out.println("Player names set!");
        System.out.println("Player 1 = " + p1);
        System.out.println("Player 2 = " + p2);
    }

    public void shuffleDeck(){
        snapGame.shuffleDeck();
        System.out.println("Deck shuffled!");
    }

    public void showDeck(){
        System.out.println("Current Deck!");
        snapGame.getDeck();
    }

}
