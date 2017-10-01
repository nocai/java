package com.liujun.dp.strategy_pattern;

public class ZhaoYun {
    public static void main(String[] args) {
        System.out.println("-----------刚刚到吴国的时候拆第一个-------------");
        Context context = new Context(new BackDoor());
        context.operate();

        //刘备乐不思蜀了，拆第二个了
        System.out.println("-----------刘备乐不思蜀了，拆第二个了-------------");
        context = new Context(new GiveGreenLight());
        context.operate();

        //孙权的小兵追了，咋办？拆第三个
        System.out.println("-----------孙权的小兵追了，咋办？拆第三个-------------");
        context = new Context(new BlockEnemy());
        context.operate();


    }
}
