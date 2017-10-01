package com.liujun.dp.Observer;

import org.junit.Test;

public class T {
    @Test
    public void t() {
        Subject subject = new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());

        subject.operation();
    }
}
