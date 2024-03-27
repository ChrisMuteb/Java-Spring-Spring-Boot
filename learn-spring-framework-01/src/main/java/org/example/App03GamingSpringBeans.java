package main.java.org.example;

import main.java.org.example.game.GameRunner;
import main.java.org.example.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();

        }
    }
}
