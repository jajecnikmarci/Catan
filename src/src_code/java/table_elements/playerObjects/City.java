package table_elements.playerObjects;

import table_elements.cards.DeckOfCards;
import table_elements.cards.Resource;
import table_elements.cards.ResourceCard;

import java.util.ArrayList;
import java.util.List;

public class City extends Settlement{
    public City(){
        List<ResourceCard> costSetter=new ArrayList<>();
        costSetter.add( new ResourceCard(Resource.ORE));
        costSetter.add( new ResourceCard(Resource.ORE));
        costSetter.add( new ResourceCard(Resource.ORE));
        costSetter.add( new ResourceCard(Resource.WHEAT));
        costSetter.add( new ResourceCard(Resource.WHEAT));
        cost= new DeckOfCards(costSetter);
        earnMultiplier=2;
    }
}
