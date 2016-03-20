package structural.decorator.decorator;

import structural.decorator.component.Game;

public class EasyModeDecorator extends GameDecorator {

    public EasyModeDecorator(Game decoratedGame) {
        super(decoratedGame);
    }

    @Override
    public void play() {
        setSuperHard(decoratedGame);
        decoratedGame.play();
    }

    private void setSuperHard(Game decoratedGame) {
        System.out.println("Mode: Easy");
    }

}