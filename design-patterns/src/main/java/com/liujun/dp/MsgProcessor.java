package com.liujun.dp;

public class MsgProcessor {
    private String msg ;

//    Filter filters = {};
    public String process() {
        String result = msg.replace("<", "[").replace(">", "]");
        return result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
