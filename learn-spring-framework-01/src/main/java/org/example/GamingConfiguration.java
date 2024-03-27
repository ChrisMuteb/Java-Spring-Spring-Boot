package main.java.org.example;

import main.java.org.example.game.GamingConsole;
import main.java.org.example.game.PacmanGame;
import main.java.org.example.game.GameRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
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
}
