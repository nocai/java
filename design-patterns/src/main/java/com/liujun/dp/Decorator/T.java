package com.liujun.dp.Decorator;

import org.junit.Test;

public class T {
    @Test
    public void t() {
        Sourceable sourceable = new Source();
        Sourceable obj = new Decorator(sourceable);
        obj.method1();
    }
}
