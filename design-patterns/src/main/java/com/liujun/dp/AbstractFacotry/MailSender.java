package com.liujun.dp.AbstractFacotry;

public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("This is a mail sender");
    }
}
