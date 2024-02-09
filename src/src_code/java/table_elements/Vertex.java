package table_elements;

import table_elements.playerObjects.Settlement;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private final List<Hexagon> neighbouringHexagons;
    private Settlement settlement;
    private boolean isPort;

    public Vertex() {
        this.neighbouringHexagons = new ArrayList<>();
    }

    public List<Hexagon> getNeighbouringHexagons() {
        return neighbouringHexagons;
    }

    public void addNeighbouringHexagon(Hexagon hexagonIn) throws ArrayStoreException{
        if (neighbouringHexagons.size()>=3) throw new ArrayStoreException();
        neighbouringHexagons.add(hexagonIn);
    }

    public Settlement getSettlement() {
        return settlement;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }

    public boolean isPort() {
        return isPort;
    }

    public void setPort(boolean port) {
        isPort = port;
    }
}
