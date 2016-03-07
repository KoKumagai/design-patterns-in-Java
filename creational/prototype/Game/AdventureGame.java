package creational.prototype.Game;

public class AdventureGame extends Game {

    public AdventureGame() {
        type = "Adventure";
    }

    @Override
    public void play() {
        System.out.println("Playing a adventure game.");
    }

}