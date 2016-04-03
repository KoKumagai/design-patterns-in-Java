package creational.prototype;

import creational.prototype.prototype.Game;
import creational.prototype.prototype.GameCache;

public class Client {

    public static void main(String[] args) {
        GameCache.loadCache();

        Game clonedGame1 = GameCache.getGame(1);
        System.out.println("Game type: " + clonedGame1.getType()); // Game type: Action

        Game clonedGame2 = GameCache.getGame(2);
        System.out.println("Game type: " + clonedGame2.getType()); // Game type: Adventure
    }

}