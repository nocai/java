package com.liujun.dp.proxy;

public class XiMenQing {
    public static void main(String[] args) {
        WanPo wanPo = new WanPo();
        wanPo.makeEyesWithMan();
        wanPo.happyWithMan();

        wanPo = new WanPo(new JiaShi());
        wanPo.makeEyesWithMan();
        wanPo.happyWithMan();
    }
}
