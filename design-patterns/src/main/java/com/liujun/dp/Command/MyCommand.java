package com.liujun.dp.Command;

public class MyCommand implements Command{
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        this.receiver.action();
    }
}
