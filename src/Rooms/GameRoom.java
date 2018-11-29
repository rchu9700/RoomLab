package Rooms;

import Game.Runner;
import People.Person;

public class GameRoom extends Room {

    public GameRoom(int a, int b) {
        super(a, b);

    }

    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You have now entered the GameRoom! Here are some cool links to play games!" +  "\n" + "http://www.agame.com/games" + "\n" + "https://www.mathsisfun.com/" + "\n" + "https://www.arkadium.com/free-online-games/" + "\n" + "https://www.kongregate.com/top-rated-games");
        Runner.gameOff();
    }


}
