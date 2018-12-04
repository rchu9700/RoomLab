package Board;

import Rooms.Room;

public class Board {
    private Room[][] building;
    public Board(Room[][] building) {
        this.building = building;
    }
    public void print() {
        String row = "";
        for (int i = 0; i < building.length; i++) {
            row = "";
            for (int j = 0; j < building[i].length; j++) {
                row = row + building[i][j].toString();
            }
            System.out.println(row);
        }
    }
}
