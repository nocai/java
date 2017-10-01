package com.liujun.dp.Bridge;

import org.junit.Test;


public class T {
    @Test
    public void t() {
        Bridge bridge = new MyBridge();
        Sourceable source = new SourceSub1();
        bridge.setSource(source);
        bridge.method();

        source = new SourceSub2();
        bridge.setSource(source);
        bridge.method();
    }

}
