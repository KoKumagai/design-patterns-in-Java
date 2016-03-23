package structural.flyweight;

import structural.flyweight.flyweight.ActionGame;
import structural.flyweight.flyweightFactory.GameFactory;

import java.util.Random;

public class Client {

    private static final String[] modes = {"easy", "normal", "hard"};

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int index = new Random().nextInt(modes.length);
            ActionGame actionGame = (ActionGame) GameFactory.getActionGame(modes[index]);
            System.out.println("Action game Id: " + System.identityHashCode(actionGame));
            actionGame.play();
            /*
               Action game Id: 1580066828
               Mode: normal
               Playing a action game.
               Action game Id: 491044090
               Mode: easy
               Playing a action game.
               Action game Id: 491044090
               Mode: easy
               Playing a action game.
               Action game Id: 644117698
               Mode: hard
               Playing a action game.
               Action game Id: 491044090
               Mode: easy
               Playing a action game.
             */
        }
    }

}