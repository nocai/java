package com.liujun.dp.Observer;

import java.util.Vector;

public abstract class AbstractSubject implements Subject{
    private Vector<Observer> observers = new Vector<>();

    @Override
    public void add(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void del(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }
}
