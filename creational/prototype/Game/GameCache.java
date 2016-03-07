package creational.prototype.Game;

import java.util.Hashtable;

public class GameCache {

    private static Hashtable<Integer, Game> gameMap = new Hashtable<Integer, Game>();

    public static Game getGame(int id) {
        Game cachedGame = gameMap.get(id);
        return (Game) cachedGame.clone();
    }

    public static void loadCache() {
        ActionGame actionGame = new ActionGame();
        actionGame.setId(1);
        gameMap.put(actionGame.getId(), actionGame);

        AdventureGame adventureGame = new AdventureGame();
        adventureGame.setId(2);
        gameMap.put(adventureGame.getId(), adventureGame);
    }

}