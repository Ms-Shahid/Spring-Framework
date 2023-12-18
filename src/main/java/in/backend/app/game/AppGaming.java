package in.backend.app.game;

import in.backend.app.game.GameRunner;
import in.backend.app.game.MarioGame;
import in.backend.app.game.PacMan;
import in.backend.app.game.SuperContraGame;

public class AppGaming {

    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacMan = new PacMan();

        var gameRunner = new GameRunner(pacMan);

        /*
        * object creation
        * Game is a dependency of GameRunner -> The game is injected / wired into the GameRunner class*/


        gameRunner.run();
    }
}
