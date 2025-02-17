package CardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {

    public ArrayList<Card> deckOfCards;

    //    private String name;
//TO DO CREATE CARD GAME NAME
    public CardGame() {
        this.deckOfCards = new ArrayList<>();
        newDeck();
    }

    private void newDeck() {
        String[] suits = {"♠", "♢", "♡", "♣"};
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (String suit : suits) {
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

    public ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }


    public void playGame(){
        System.out.println(".");
    }
}

//    STAGE 1
//    Array List for Cards for deckOfCards - this will contain 52 cards

//    Method that will create and populate this deck of cards when the game is initialised

//    getDeck() Method. This will list out all the cards in the deck in its current order

//    Cards have a String (suit) this will use the unicode characters found in a deck ((♠ ♥ ♦ ♣ OR ♤ ♡ ♢ ♧)

//    each card has a String symbol. this is what is found on the card (A 2 3 4 5 6 7 8 9 10 J Q K)

//    each card has an int value (2 3 4 5 6 7 8 9 10 11 12 13 14(?))

//    toString() Method. This will describe the class

//    STAGE 2
    

