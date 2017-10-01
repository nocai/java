package com.liujun.dp.abstrct_factory;

public abstract class AbstractBlackHuman implements Human {
    public void laugh() {
        System.out.println("黑种人会笑");
    }

    public void cry() {
        System.out.println("黑种人会哭");
    }

    public void talk() {
        System.out.println("黑种人会说话 ");
    }
}
