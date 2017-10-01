package com.liujun.dp.proxy;

public class WanPo implements KindWomen{

    private KindWomen women;

    public WanPo() {
        this.women = new PanJinLian();
    }

    public WanPo(KindWomen women) {
        this.women = women;
    }

    public void makeEyesWithMan() {
        this.women.makeEyesWithMan();

    }

    public void happyWithMan() {
        this.women.happyWithMan();
    }
}
