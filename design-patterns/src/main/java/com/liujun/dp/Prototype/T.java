package com.liujun.dp.Prototype;

import org.junit.Test;

public class T {
    @Test
    public void t() {
        Prototype proto = new Prototype();
        Object clone = null;
        try {
            clone = proto.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Prototype protoClone = (Prototype) clone;
        System.out.println(protoClone == proto);
    }
}
