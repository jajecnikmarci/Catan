package Logic;

import table_elements.Edge;
import table_elements.Hexagon;
import table_elements.Vertex;

public class Table {
    public Hexagon[][] getHexagons() {
        return hexagons;
    }

    public Vertex[][] getVertexes() {
        return vertexes;
    }

    public Edge[][] getEdges() {
        return edges;
    }
    public Hexagon getHexagon(int y, int x) {
        return hexagons[y][x];
    }

    public Vertex getVertex(int y, int x) {
        return vertexes[y][x];
    }

    public Edge getEdge(int y, int x) {
        return edges[y][x];
    }

    private final Hexagon[][] hexagons;
    private final Vertex[][] vertexes;
    private final Edge[][] edges;
    public Table(){
        hexagons=new Hexagon[6][6];
        vertexes=new Vertex[15][16];
        edges=new Edge[22][15];
    }
}
