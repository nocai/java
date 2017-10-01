package com.liujun.dp.singleton;

// 皇帝、单例
public class Emperor {
    private static Emperor emperor = null;

    private Emperor() {

    }

    public static Emperor getInstance() {
        if (emperor == null) {
            emperor = new Emperor();
        }

        return emperor;
    }

    public static void emperorInfo() {
        System.out.println("我就是皇帝某某某。。。");
    }
}
