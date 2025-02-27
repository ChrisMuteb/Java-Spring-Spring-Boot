package com.lasuperbe.learnspringframework;

import com.lasuperbe.learnspringframework.game.GameRunner;
import com.lasuperbe.learnspringframework.game.GamingConsole;
import com.lasuperbe.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();

        }

    }
}
