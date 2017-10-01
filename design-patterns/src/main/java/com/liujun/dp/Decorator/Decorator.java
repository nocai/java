package com.liujun.dp.Decorator;

public class Decorator implements Sourceable{
    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

    @Override
    public void method1() {
        System.out.println("before decorator!");
        this.sourceable.method1();
        System.out.println("after decorator!");
    }
}
