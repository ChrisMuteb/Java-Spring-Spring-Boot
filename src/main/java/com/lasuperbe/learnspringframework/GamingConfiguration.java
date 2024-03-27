package com.lasuperbe.learnspringframework;

import com.lasuperbe.learnspringframework.game.GameRunner;
import com.lasuperbe.learnspringframework.game.GamingConsole;
import com.lasuperbe.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
    //        var marioGame = new MarioGame();
//        var game = new SuperContraGame();
//    var game = new PacmanGame();
//    var gameRunner = new GameRunner(game);
//        gameRunner.run();
}
