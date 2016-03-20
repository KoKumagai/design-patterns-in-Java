package structural.decorator.decorator;

import structural.decorator.component.Game;

public class GameDecorator implements Game {

    protected Game decoratedGame;

    public GameDecorator(Game decoratedGame) {
        this.decoratedGame = decoratedGame;
    }

    @Override
    public void play() {
        decoratedGame.play();
    }

}