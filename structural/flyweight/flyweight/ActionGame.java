package structural.flyweight.flyweight;

public class ActionGame implements Game {

    private String mode;

    public ActionGame(String mode) {
        this.mode = mode;
    }

    @Override
    public void play() {
        System.out.println("Mode: " + mode);
        System.out.println("Playing a action game.");
    }

}