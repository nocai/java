package com.liujun.dp.factory_method;

import com.sun.org.apache.xpath.internal.SourceTree;

public class NvWa {
    public static void main(String[] args) {
        System.out.println("Create WhiteHuman");
        Human human = HumanFactory.createHuman(WhiteHuman.class);
        human.laugh();
        human.cry();
        human.talk();

        System.out.println("Create BlackHuman");
        human = HumanFactory.createHuman(BlackHuman.class);
        human.laugh();
        human.cry();
        human.talk();

        System.out.println("Create YellowHuman");
        human = HumanFactory.createHuman(YellowHuman.class);
        human.laugh();
        human.cry();
        human.talk();

        for (int i = 0; i < 100000000; i++) {
            System.out.println("随便造人了");
            Human h = HumanFactory.createHuman();
            h.laugh();
            h.cry();
            h.talk();
        }
    }
}
