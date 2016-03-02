package creational.factoryMethod;

public class GameFactory {

    public Game getGame(String gameType) {
        if (gameType == null) {
            return null;
        }

        if (gameType.equalsIgnoreCase("Action")) {
            return new ActionGame();
        }

        if (gameType.equalsIgnoreCase("Adventure")) {
            return new AdventureGame();
        }

        return null;
    }

}