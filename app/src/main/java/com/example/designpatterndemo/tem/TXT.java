package com.example.designpatterndemo.tem;

import android.util.Log;

/**
 * author : xx
 * time : 2020/5/28 20:00
 * describe :
 **/
public class TXT extends Game{
    @Override
    void initialize() {
        Log.i("TAG", "initialize: TXT");
    }

    @Override
    void startGame() {
        Log.i("TAG", "startGame: TXT");
    }

    @Override
    void endGame() {
        Log.i("TAG", "endGame: TXT");
    }
}
