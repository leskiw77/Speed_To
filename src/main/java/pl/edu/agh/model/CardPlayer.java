package pl.edu.agh.model;

public class CardPlayer {

    private Hand hand;
    private String name;
    private CoveredCards playersCoveredCards;

    public CardPlayer(Hand hand, String name, CoveredCards playersCoveredCards) {
        this.hand = hand;
        this.name = name;
        this.playersCoveredCards = playersCoveredCards;
    }
}
