package table_elements.cards;

import java.util.ArrayList;
import java.util.List;

/**
 * Stores cards that are logically are at the same place, like in a hand
 */
public class DeckOfCards {
    private final List<Card> cards;

    public DeckOfCards(List<ResourceCard> cardsIn) {
        cards=new ArrayList<>();
        cards.addAll(cardsIn);
    }
    public void addCard(Card card){

    }
}
