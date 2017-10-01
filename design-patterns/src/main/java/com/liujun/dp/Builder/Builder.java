package com.liujun.dp.Builder;

import com.liujun.dp.AbstractFacotry.MailSender;
import com.liujun.dp.AbstractFacotry.Sender;
import com.liujun.dp.AbstractFacotry.SmsSender;

import java.util.ArrayList;
import java.util.List;

public class Builder {
    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i ++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}
