package structural.decorator.component;

public class ActionGame implements Game {

    @Override
    public void play() {
        System.out.println("Playing a action game.");
    }

}