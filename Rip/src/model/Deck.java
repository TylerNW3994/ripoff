package model;

/**
 * This class contains the Deck object which will represent the card deck in the game. In the game, it will contain all of a user's usable cards.
 *
 * @author Brandon Kyle Last Updated: 10/1/2019
 */

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deckCards = new ArrayList<Card>();

    public Deck(ArrayList<Card> _cards) {
        this.deckCards = _cards;
    }

    public Deck() {
    }

    /**
     * This method will return all the Cards in the Deck.
     *
     * @return
     */
    @Override
    public String toString() {
        String returnedString = "This user's deck contains the cards:\n";
        for(int count=0; count<deckCards.size(); count++) {
            returnedString += deckCards.get(count) + "\n";
        }
        return returnedString;
    }

    /**
     * This method will calculate the total power of all of the Cards in a Deck.
     *
     * @return
     */
    public int calculateTotalPower() {
        int totalPower = 0;
        for(int count=0; count<deckCards.size(); count++) {
            totalPower += deckCards.get(count).getPower();
        }
        return totalPower;
    }

    /**
     * Called when a specific number of cards needs to be randomly drawn from the deck. The randomly drawn cards are not replaced. Returns an ArrayList of the cards that were drawn.
     *
     * @param _numberDrawn
     * @return
     */
    public ArrayList<Card> drawCards(int _numberDrawn) {
        ArrayList<Card> drawnCards = new ArrayList();
        Card cardDrawn;
        for(int count=0; count<_numberDrawn; count++) {
            // If the user is out of cards to draw the loop will terminate so that an error is not thrown.
            if(this.deckCards.isEmpty()) {
                System.out.println("User has no more cards to draw.");
                break;
            }
            cardDrawn = this.deckCards.remove((int) (Math.random()*this.deckCards.size()));
            drawnCards.add(cardDrawn);
        }
        return drawnCards;
    }

    /**
     * This method will randomly select a card from the deck.
     *
     * @return
     */
    public Card randomPick() {
        int cardToPick = (int) (Math.random()*this.deckCards.size());
        return this.deckCards.get(cardToPick);
    }

    /**
     * This method will add a Card to the Deck.
     *
     * @param _cardToAdd
     * @return
     */
    public void addCard(Card _cardToAdd) {
        this.deckCards.add(_cardToAdd);
    }

    /**
     * This method will add an ArrayList of Cards into the Deck.
     *
     * @param _setToAdd
     */
    public void addSet(ArrayList<Card> _setToAdd) {
        int originalSize = _setToAdd.size();
        for(int count=0; count<originalSize; count++) {
            this.deckCards.add(_setToAdd.remove(0));
        }
    }

// ================= GETTERS ==========================
    public ArrayList getDeckCards() {
        return this.deckCards;
    }

    public int getSize() {
        return this.deckCards.size();
    }

// ================= SETTERS ==========================
    public void setDeckCards(ArrayList<Card> newDeck) {
        this.deckCards = newDeck;
    }

}
