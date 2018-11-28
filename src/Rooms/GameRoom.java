package Rooms;

import Game.Runner;
import People.Person;

public class GameRoom extends Room {

    public GameRoom(int x, int y) {
        super(x, y);

    }

    @Override
    public void enterRoom(Person x) {

        occupant = x;

    }
}
