package com.liujun.dp.AbstractFacotry;

import org.junit.Test;

/**
 * Created by JunLiu on 2017/5/17.
 */
public class T {
    @Test
    public void test() {
        Provider provider = new MailSendFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
