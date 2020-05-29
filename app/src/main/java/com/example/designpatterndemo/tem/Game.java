package com.example.designpatterndemo.tem;

/**
 * author : xx
 * time : 2020/5/28 19:57
 * describe :
 **/
public abstract class Game {
    abstract void initialize();

    abstract void startGame();

    abstract void endGame();

    //执行方式-模板
    public void play() {
        initialize();

        startGame();

        endGame();
    }
}
