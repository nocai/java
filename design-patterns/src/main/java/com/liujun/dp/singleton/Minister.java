package com.liujun.dp.singleton;

// 大臣们
public class Minister {
    public static void main(String[] args) {
        Emperor emperor = Emperor.getInstance();
        emperor.emperorInfo();

        emperor = Emperor.getInstance();
        emperor.emperorInfo();

        emperor = Emperor.getInstance();
        emperor.emperorInfo();


        System.out.println(emperor == Emperor.getInstance());
    }
}
