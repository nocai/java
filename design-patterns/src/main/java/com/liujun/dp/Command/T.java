package com.liujun.dp.Command;

import org.junit.Test;

public class T {
    @Test
    public void t() {
        Receiver receiver = new Receiver();
        Command command = new MyCommand(receiver);
        Invoker invoker = new Invoker(command);

        invoker.action();
    }
}

