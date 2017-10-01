package com.liujun.dp.Command;

/**
 * Created by JunLiu on 2017/5/17.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.exe();
    }
}
