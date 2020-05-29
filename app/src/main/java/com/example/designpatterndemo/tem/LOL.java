package com.example.designpatterndemo.tem;

import android.util.Log;
import android.widget.Toast;

/**
 * author : xx
 * time : 2020/5/28 19:58
 * describe :
 **/
public class LOL extends Game{
    @Override
    void initialize() {
        Log.i("TAG", "initialize: LOL");
    }

    @Override
    void startGame() {
        Log.i("TAG", "startGame: LOL");
    }

    @Override
    void endGame() {
        Log.i("TAG", "endGame: LOL");
    }
}
