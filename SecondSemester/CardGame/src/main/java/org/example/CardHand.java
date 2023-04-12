package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CardHand {
    //Make another class called “CardHand”. This should resemble one of the players hands of cards in the game.
    // You choose the data-structure for this and think about why?
    //Make a method on the CardHand class to order the cards by suit and secondly value.
    // Design your program to automatically sort the CardHand, when you add cards to CardHand.
    private int cardHandSize;
    private List<Card> handOfCards = new ArrayList<>();

    public CardHand(int cardHandSize, List<Card> handOfCards) {
        this.cardHandSize = cardHandSize;
        this.handOfCards = handOfCards;
    }

    public CardHand(){
    }

    public List<Card> sortHandOfCards (List<Card> handOfCards){
        handOfCards.sort(new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {

                if(o1.getSuit().equals(o2.getSuit()))
                    return o1.getValue().compareTo(o2.getValue());

                else return o1.getSuit().compareTo(o2.getSuit());
            }
        });
        return handOfCards;
    }

    public int getCardHandSize() {
        return cardHandSize;
    }

    public void setCardHandSize(int cardHandSize) {
        this.cardHandSize = cardHandSize;
    }

    public List<Card> getHandOfCards() {
        return handOfCards;
    }

    public void setHandOfCards(List<Card> handOfCards) {
        this.handOfCards = handOfCards;
    }
}
