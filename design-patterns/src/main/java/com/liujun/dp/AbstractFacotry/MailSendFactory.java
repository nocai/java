package com.liujun.dp.AbstractFacotry;

public class MailSendFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
