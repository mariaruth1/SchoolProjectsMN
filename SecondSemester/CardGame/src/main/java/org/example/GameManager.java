package org.example;

import java.util.EmptyStackException;
import java.util.List;

public class GameManager {
    Deck deck = new Deck();
    CardHand cardHand = new CardHand();
    //Make a method on the GameManager where you can draw a card from the deck. drawCard(Deck d)
    //Make methods for filling a deck with cards and adding it to the GameManager
    public Card drawCard(Deck d){
        Card c;
        if(!d.getCardDeck().isEmpty()) {
            c = d.getCardDeck().pop();
        }
        else throw new EmptyStackException();
        return c;
    }

    public void populateDeck(){
        deck.populateDeck();
    }

    public void updateCardHand(){
        List<Card> currentHand = cardHand.getHandOfCards();
        while(cardHand.getCardHandSize()<5) {
            cardHand.addCard(drawCard(deck));
            System.out.println(cardHand.getHandOfCards().get(cardHand.getHandOfCards().size()-1).getSuit()+ ", " + cardHand.getHandOfCards().get(cardHand.getHandOfCards().size()-1).getValue());
        }
        cardHand.sortHandOfCards(currentHand);
    }
}
