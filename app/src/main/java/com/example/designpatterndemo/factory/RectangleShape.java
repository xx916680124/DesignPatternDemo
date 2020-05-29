package com.example.designpatterndemo.factory;

/**
 * author : xx
 * time : 2020/5/28 19:50
 * describe :
 **/
class RectangleShape implements Shape {
    @Override
    public String draw() {
        return "画个长方形";
    }
}
