package table_elements;

import java.util.Random;

public class Dice {
    public int getLastRolledNumber() {
        return lastRolledNumber;
    }

    private int lastRolledNumber;
    public int rollDice(){
        Random Random = new Random();
        lastRolledNumber =Random.nextInt()%6;
        return lastRolledNumber;
    }

}
