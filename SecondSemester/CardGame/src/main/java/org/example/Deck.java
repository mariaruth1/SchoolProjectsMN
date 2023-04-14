package org.example;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Deck {
    // implement the deck using a Stack of Card. The Deck is a collection of cards resembling a card-deck.
    //Add a method to the Deck to shuffle the cards.
    private Stack<Card> cardDeck = new Stack<>();
    private String[] suits = {"diamonds", "spades", "hearts", "clubs"};
    private String[] cardValues = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    public Deck(Stack<Card> cardDeck, String[] suits) {
        this.cardDeck = cardDeck;
        this.suits = suits;
    }

    public Deck(){}

    public Stack<Card> getCardDeck() {
        return cardDeck;
    }

    public void setCardDeck(Stack<Card> cardDeck) {
        this.cardDeck = cardDeck;
    }

    public String[] getSuits() {
        return suits;
    }

    public void setSuits(String[] suits) {
        this.suits = suits;
    }

    public Stack<Card> populateDeck(){
        for (String suit: suits){
            for (String value: cardValues)
                cardDeck.add(new Card(suit, value));
        }
        shuffleCards();
        return cardDeck;
    }

    public void shuffleCards(){
        Collections.shuffle(cardDeck);
    }

}
