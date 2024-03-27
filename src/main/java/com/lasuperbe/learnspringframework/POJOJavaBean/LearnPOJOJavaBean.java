package com.lasuperbe.learnspringframework.POJOJavaBean;

import java.io.Serializable;

class Pojo{
    private String text;
    private int number;
    public String toString(){
        return text + ":" + number;
    }
}

class JavaBean implements Serializable {
    private String text;
    private int number;
    // 1: public no-arg constructor

    public JavaBean() {
    }

    // 2: getters & setters

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // 3: implement Serializable
}

public class LearnPOJOJavaBean {
    public static void main(String[] args) {
        System.out.println(new Pojo());
    }
}
