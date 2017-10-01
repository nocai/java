package com.liujun.dp.Proxy1;

import org.junit.Test;

public class T {
    @Test
    public void t() {
        Sourceable sourceable = new Source();
        Sourceable proxy = new Proxy(sourceable);
        proxy.method();
    }
}
