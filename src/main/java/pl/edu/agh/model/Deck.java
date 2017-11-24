package pl.edu.agh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> cards;
    private Random random;

    public Deck() {
        this.random = new Random();

        cards = new ArrayList<Card>();
        for (CardSuit suit : CardSuit.values()) {
            for (CardRank rank : CardRank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    private void createDeck() {
        cards = new ArrayList<Card>();
        for (CardSuit suit : CardSuit.values()) {
            for (CardRank rank : CardRank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public Card takeRandom() {
        return cards.remove(random.nextInt(cards.size()));
    }
}