package structural.decorator;

import structural.decorator.component.ActionGame;
import structural.decorator.component.AdventureGame;
import structural.decorator.component.Game;
import structural.decorator.decorator.EasyModeDecorator;
import structural.decorator.decorator.HardModeDecorator;

public class Client {

    public static void main(String[] args) {
        Game actionGame = new ActionGame();
        actionGame.play();
        // Playing a action game.

        Game adventureGame = new AdventureGame();
        adventureGame.play();
        // Playing a adventure game.


        Game actionGameEasyMode = new EasyModeDecorator(new ActionGame());
        actionGameEasyMode.play();
        // Mode: Easy
        // Playing a action game.

        Game actionGameHardMode = new HardModeDecorator(new ActionGame());
        actionGameHardMode.play();
        // Mode: Hard
        // Playing a action game.

        Game adventureGameEasyMode = new EasyModeDecorator(new AdventureGame());
        adventureGameEasyMode.play();
        // Mode: Easy
        // Playing a adventure game.

        Game adventureGameHardMode = new HardModeDecorator(new AdventureGame());
        adventureGameHardMode.play();
        // Mode: Hard
        // Playing a adventure game.
    }

}