package CardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class CardGame {

    protected ArrayList<Card> deckOfCards;

    public CardGame() {
        this.deckOfCards = new ArrayList<>();
        newDeck();
    }

    public abstract void playGame();

    void newDeck() {
        Suit[] suits = Suit.values();
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (Suit suit : suits) {
            for (int currentSymbol = 0; currentSymbol < symbols.length; currentSymbol++) {
                deckOfCards.add(new Card(suit, symbols[currentSymbol], values[currentSymbol]));
            }
        }
    }


    public void getDeck() {
        for (Card card : deckOfCards) {
            System.out.println(card);
        }
    }

    public Card dealCard() {
        return deckOfCards.removeFirst();
    }


    //        SORTING
    public ArrayList<Card> sortDeckInNumberOrder() {
        deckOfCards.sort(Comparator.comparingInt(Card::getValue));
        return deckOfCards;
    }

    public ArrayList<Card> sortDeckIntoSuits() {
        deckOfCards.sort(Comparator.comparing(Card::getSuit).thenComparingInt(Card::getValue));
        return deckOfCards;
    }

    public void shuffleDeck() {
        Collections.shuffle(deckOfCards);
    }

}

