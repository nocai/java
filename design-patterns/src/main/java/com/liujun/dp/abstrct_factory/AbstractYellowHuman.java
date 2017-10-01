package com.liujun.dp.abstrct_factory;


public abstract class AbstractYellowHuman implements Human {


    public void laugh() {
        System.out.println("黄种人会笑");
    }

    public void cry() {
        System.out.println("黄种人会哭");
    }

    public void talk() {
        System.out.println("黄种人会说话");
    }
}
