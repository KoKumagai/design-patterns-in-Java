package structural.flyweight.flyweightFactory;

import structural.flyweight.flyweight.ActionGame;
import structural.flyweight.flyweight.Game;

import java.util.HashMap;

public class GameFactory {

    private static final HashMap<String, Game> actionGameHashMap = new HashMap();

    public static Game getActionGame(String mode) {
        ActionGame actionGame = (ActionGame) actionGameHashMap.get(mode);

        if (actionGame == null) {
            actionGame = new ActionGame(mode);
            actionGameHashMap.put(mode, actionGame);
        }
        return actionGame;
    }

}
