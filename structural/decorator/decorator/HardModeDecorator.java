package structural.decorator.decorator;

import structural.decorator.component.Game;

public class HardModeDecorator extends GameDecorator {

    public HardModeDecorator(Game decoratedGame) {
        super(decoratedGame);
    }

    @Override
    public void play() {
        setSuperHard(decoratedGame);
        decoratedGame.play();
    }

    private void setSuperHard(Game decoratedGame) {
        System.out.println("Mode: Hard");
    }

}