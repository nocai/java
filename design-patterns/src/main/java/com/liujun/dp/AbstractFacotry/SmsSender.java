package com.liujun.dp.AbstractFacotry;

/**
 * Created by JunLiu on 2017/5/17.
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("This is a sms sender");
    }
}
