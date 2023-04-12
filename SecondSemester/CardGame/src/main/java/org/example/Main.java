package org.example;

public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        gameManager.populateDeck();
        System.out.println(gameManager.deck.getCardDeck().size());
        System.out.println(gameManager.cardHand.getCardHandSize());
        gameManager.updateCardHand();
        System.out.println(gameManager.deck.getCardDeck().size());
        System.out.println(gameManager.cardHand.getCardHandSize());
    }
}