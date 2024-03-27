package com.lasuperbe.learnspringframework;

import com.lasuperbe.learnspringframework.game.GameRunner;
import com.lasuperbe.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
//        var marioGame = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
