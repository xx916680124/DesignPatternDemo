package com.example.designpatterndemo.factory;

import android.text.TextUtils;

/**
 * author : xx
 * time : 2020/5/28 19:42
 * describe :
 **/
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (TextUtils.isEmpty(shapeType)){
            return null;
        }
        if (shapeType.equals(Constants.CIRCLE)) {
            return new CircleShape();
        } else if (shapeType.equals(Constants.SQUARE)) {
            return new SquareShape();
        } else if (shapeType.equals(Constants.RECTANGLE)) {
            return new RectangleShape();
        }
        return null;
    }
}
