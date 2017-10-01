package com.liujun.dp.singleton;

// 通用模式
public class SingletonPattern {
    private static final SingletonPattern singleton = new SingletonPattern();

    private SingletonPattern() {

    }

    public static SingletonPattern getInstance() {
        return singleton;
    }
}
