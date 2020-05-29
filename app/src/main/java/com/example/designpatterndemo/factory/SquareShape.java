package com.example.designpatterndemo.factory;

/**
 * author : xx
 * time : 2020/5/28 19:49
 * describe :
 **/
class SquareShape implements Shape {
    @Override
    public String draw() {
        return "画个正方形";
    }
}
