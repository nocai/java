package com.liujun.dp.Observer;

public interface Subject {
    public void add(Observer observer);

    public void del(Observer observer);

    public void notifyObserver();

    public void operation();

}
