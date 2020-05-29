package com.example.designpatterndemo.single;

/**
 * author : xx
 * time : 2020/5/28 18:52
 * describe :
 **/
public class SingleIntance {
    private static volatile SingleIntance instance;

    private SingleIntance() {
    }



    public static SingleIntance getInstance() {
        if (instance==null){
            synchronized (SingleIntance.class){
                if (instance==null){
                    instance=new SingleIntance();
                }
            }
        }
        return instance;
    }
    public String fun() {
        return "这是单例模式中的方法返回的字符串";
    }

}
