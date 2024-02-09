package table_elements.playerObjects;

import table_elements.cards.DeckOfCards;
import table_elements.cards.Resource;
import table_elements.cards.ResourceCard;

import java.util.ArrayList;
import java.util.List;

public class Road extends PlayerObject{
    public Road() {
        List<ResourceCard> costSetter=new ArrayList<>();
        costSetter.add( new ResourceCard(Resource.WOOD));
        costSetter.add( new ResourceCard(Resource.BRICK));
        cost= new DeckOfCards(costSetter);
    }
}
