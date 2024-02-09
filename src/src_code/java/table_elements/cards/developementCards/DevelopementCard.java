package table_elements.cards.developementCards;


import table_elements.cards.Card;
import table_elements.cards.DeckOfCards;
import table_elements.cards.Resource;
import table_elements.cards.ResourceCard;

import java.util.ArrayList;
import java.util.List;

/**
 * Development cards can be bought and played during the game, each of them preforms an action, then goes back to the deck int the bank
 */
public abstract class DevelopementCard extends Card {
    static public DeckOfCards cost;
    public DevelopementCard(){
        List<ResourceCard> costSetter=new ArrayList<>();
        costSetter.add( new ResourceCard(Resource.WHEAT));
        costSetter.add( new ResourceCard(Resource.SHEEP));
        costSetter.add( new ResourceCard(Resource.ORE));
        cost=new DeckOfCards(costSetter);
    }

    /**
     * To buy a development card, the player needs to have the cost
     * After taking the resource card from the player back to the deck at the bank,
     * the player receives a random card from the deck of development cards at the bank
     */
    public void buy(){

    }

    /**
     * When a development card is played, it preforms his action then goes back to the deck in the bank
     * Needs to be overridden by child class
     */
    public void action(){

    }

}
