package table_elements.cards;

/**
 * A resource card is a single card, that can be used for building, buying, or as cost
 */
public class ResourceCard extends Card{

    private final Resource resource;
    public ResourceCard(Resource resource) {
        this.resource = resource;
    }
    public Resource getResource() {
        return resource;
    }




}
