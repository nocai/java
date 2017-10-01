package com.liujun.dp.multition;

/**
 * 大臣
 * Created by liujun on 2017-5-9.
 */
public class Minister {
    public static void main(String[] args) {
        int ministerNum = 10; //10个大臣
        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("第" + (i + 1) + "个大臣参拜的是：");
            emperor.emperorInfo();
        }
    }
}
