package com.liujun.dp.Bridge;

public class MyBridge extends Bridge{
    public void method() {
        this.getSource().method();
    }
}
