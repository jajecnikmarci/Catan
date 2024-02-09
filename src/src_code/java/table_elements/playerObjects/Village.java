package table_elements.playerObjects;

import table_elements.cards.DeckOfCards;
import table_elements.cards.Resource;
import table_elements.cards.ResourceCard;

import java.util.ArrayList;
import java.util.List;

public class Village extends Settlement{

    public Village() {
        List<ResourceCard> costSetter=new ArrayList<>();
        costSetter.add( new ResourceCard(Resource.WOOD));
        costSetter.add( new ResourceCard(Resource.BRICK));
        costSetter.add( new ResourceCard(Resource.SHEEP));
        costSetter.add( new ResourceCard(Resource.WHEAT));
        cost= new DeckOfCards(costSetter);
        earnMultiplier=1;
    }
}
