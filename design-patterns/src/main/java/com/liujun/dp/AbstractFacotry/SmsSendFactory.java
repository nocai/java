package com.liujun.dp.AbstractFacotry;

/**
 * Created by JunLiu on 2017/5/17.
 */
public class SmsSendFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
