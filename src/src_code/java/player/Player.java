package player;

import table_elements.cards.DeckOfCards;

import java.awt.*;

public class Player {
    private final String name;
    private final int id;
    private final Color color;
    private int score;
    private int numberOfPlayedKnightCards;
    private DeckOfCards cardsInHand;

    public Player(String name, int id, Color color) {
        this.name = name;
        this.id = id;
        this.color = color;
    }
}
