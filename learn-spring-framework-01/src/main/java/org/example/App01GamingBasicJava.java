package main.java.org.example;

import main.java.org.example.game.GameRunner;
import main.java.org.example.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        //        var marioGame = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
