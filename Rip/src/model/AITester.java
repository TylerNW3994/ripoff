package model;

/**
 * This class performs tests to ensure that the ComputerOpponent class is working properly.
 *
 * @author Brandon Kyle Last Updated: 10/06/2019
 */
import java.util.ArrayList;
public class AITester {

    public static void main(String args[]) {
        Card testCardOne = new Card("Card One", "01", 1);
        Card testCardTwo = new Card("Card Two", "02", 2);
        Card testCardThree = new Card("Card Three", "03", 3);
        Card testCardFour = new Card("Card Four", "04", 4);
        Card testCardFive = new Card("Card Five", "05", 5);
        Card testCardSix = new Card("Card Six", "06", 6);
        Card testCardSeven = new Card("Card Seven", "07", 7);
        Card testCardEight = new Card("Card Eight", "08", 8);
        Card testCardNine = new Card("Card Nine", "09", 9);
        Card testCardTen = new Card("Card Ten", "10", 10);
        ArrayList<Card> arrayDeckOne = new ArrayList();
        arrayDeckOne.add(testCardOne);
        arrayDeckOne.add(testCardTwo);
        arrayDeckOne.add(testCardThree);
        ArrayList<Card> arrayDeckTwo = new ArrayList();
        arrayDeckTwo.add(testCardFour);
        arrayDeckTwo.add(testCardFive);
        arrayDeckTwo.add(testCardSix);
        Deck deckLight = new Deck(arrayDeckOne);
        Deck deckHeavy = new Deck (arrayDeckTwo);
        ComputerOpponent steve = new ComputerOpponent(deckLight);
        ComputerOpponent simon = new ComputerOpponent(deckHeavy);
        steve.compareInitialPower(simon);
        simon.compareInitialPower(steve);
        steve.queryForCard(2);
        simon.queryForCard(2);
        steve.queryForCard(2);
        simon.queryForCard(2);
        steve.queryForCard(2);
        simon.queryForCard(2);
        steve.queryForCard(2);
        simon.queryForCard(2);
    }

}
