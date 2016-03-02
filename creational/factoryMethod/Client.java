package creational.factoryMethod;

public class Client {

    public static void main(String[] args) {
        GameFactory gameFactory = new GameFactory();

        Game game1 = gameFactory.getGame("Action");
        game1.play(); // Playing a action game.

        Game game2 = gameFactory.getGame("Adventure");
        game2.play(); // Playing a adventure game.
    }

}