package Commands;

import CardGame.Snap;

import java.util.Scanner;

public class Menu {
    private Snap snapGame;
    private Scanner scanner;
    private MenuCommands menuCommands;

    public Menu(){
        this.snapGame = new Snap();
        this.scanner = new Scanner(System.in);
        this.menuCommands = new MenuCommands(snapGame);
    }

    public void showMenu(){
        while(true){
            System.out.println("WELCOME TO SNAP! Select an option");
            System.out.println("1 - Start Game!");
            System.out.println("2 - Set Names");
            System.out.println("3 - Shuffle Deck");
            System.out.println("4 - Show Deck");
            System.out.println("5 - Exit Game");
            String menuChoice = scanner.nextLine();

            switch (menuChoice){
                case "1": snapGame.playGame();
                case "2": menuCommands.setPlayerNames();
                case "3": menuCommands.shuffleDeck();
                case "4": menuCommands.showDeck();
                case "5": return;
                default:System.out.println("Invalid choice, try again");

            }
        }
    }
}
