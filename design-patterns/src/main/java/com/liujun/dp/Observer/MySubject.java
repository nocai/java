package com.liujun.dp.Observer;

public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self");
        this.notifyObserver();
    }
}
