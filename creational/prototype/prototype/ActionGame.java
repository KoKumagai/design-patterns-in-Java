package creational.prototype.prototype;

public class ActionGame extends Game {

    public ActionGame() {
        type = "Action";
    }

    @Override
    public void play() {
        System.out.println("Playing a action game.");
    }

}