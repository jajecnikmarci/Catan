package table_elements;

import table_elements.cards.Resource;

import java.util.List;

public class Hexagon {
    public int getNumberForDice() {
        return numberForDice;
    }

    public void setNumberForDice(int numberForDice) {
        this.numberForDice = numberForDice;
    }

    private int numberForDice;

    public List<Vertex> getNeighbouringVertexes() {
        return neighbouringVertexes;
    }

    public void addVertex(Vertex vertex) {
        if (neighbouringVertexes.size()>=6) throw new ArrayStoreException();
        this.neighbouringVertexes.add(vertex);
    }

    private List<Vertex> neighbouringVertexes;

    public Resource getEarnableResource() {
        return earnableResource;
    }

    public void setEarnableResource(Resource earnableResource) {
        this.earnableResource = earnableResource;
    }

    private Resource earnableResource;

}
