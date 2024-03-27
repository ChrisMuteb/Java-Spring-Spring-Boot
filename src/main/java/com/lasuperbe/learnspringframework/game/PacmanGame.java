package com.lasuperbe.learnspringframework.game;

public class PacmanGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Pac up");
    }

    @Override
    public void down() {
        System.out.println("Pac down");
    }

    @Override
    public void left() {
        System.out.println("Pac left");
    }

    @Override
    public void right() {
        System.out.println("Pac right");
    }
}
