package Commands;

import CardGame.Snap;

import java.util.Scanner;

public class MenuCommands {
    private Snap snapGame;
    private Scanner scanner;

    public MenuCommands(Snap snapGame){
        this.snapGame = snapGame;
        this.scanner = new Scanner(System.in);
    }
}
