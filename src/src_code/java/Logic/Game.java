package Logic;

import player.Player;
import table_elements.Dice;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<Player> players;
    private final Table table;
    private final DownCounter downCounter;

    public Game() {
        this.dices = new ArrayList<>();
        dices.add(new Dice());
        dices.add(new Dice());
        table= new Table();
        downCounter=new DownCounter();
        players=new ArrayList<>();
    }

    private final List<Dice> dices;

    public List<Player> getPlayers() {
        return players;
    }

    public Table getTable() {
        return table;
    }

    public DownCounter getDownCounter() {
        return downCounter;
    }
}
