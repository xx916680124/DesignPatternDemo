package com.example.designpatterndemo.factory;

/**
 * author : xx
 * time : 2020/5/28 19:48
 * describe :
 **/
class CircleShape implements Shape {
    @Override
    public String draw() {
        return "画个圆";
    }
}
