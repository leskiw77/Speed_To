package pl.edu.agh.model;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class CardSet  {

    private List<Card> cards;

    public CardSet() {
        this.cards = new LinkedList<Card>();
    }

    public CardSet(List<Card> cards) {
        this.cards = cards;
    }


    public int size() {
        return cards.size();
    }


    public void addCard(Card card) {
        cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return cards.stream().map(Object::toString).collect(Collectors.joining(", "));
    }
}
