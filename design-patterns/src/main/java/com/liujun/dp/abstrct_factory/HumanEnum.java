package com.liujun.dp.abstrct_factory;

public enum HumanEnum {
    //把世界上所有人类型都定义出来
    YelloMaleHuman("com.liujun.dp.abstrct_factory.YellowMaleHuman"),
    YelloFemaleHuman("com.liujun.dp.abstrct_factory.YellowFemaleHuman"),
    WhiteFemaleHuman("com.liujun.dp.abstrct_factory.WhiteFemaleHuman"),
    WhiteMaleHuman("com.liujun.dp.abstrct_factory.WhiteMaleHuman"),
    BlackFemaleHuman("com.liujun.dp.abstrct_factory.BlackFemaleHuman"),
    BlackMaleHuman("com.liujun.dp.abstrct_factory.BlackMaleHuman");
    private String value = "";

    //定义构造函数，目的是Data(value)类型的相匹配
    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
/*
* java enum类型尽量简单使用，尽量不要使用多态、继承等方法
* 毕竟用Clas完全可以代替enum
*/
}