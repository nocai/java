package com.liujun.dp.Adapter;

import org.junit.Test;

public class T {
    @Test
    public void t() {
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
    }

    @Test
    public void t2() {
        Source source = new Source();
        Targetable targetable = new Wrapper(source);
        targetable.method1();
        targetable.method2();
    }

    @Test
    public void t3() {
        Sourceable sourceable1 = new SourceSub1();
        Sourceable sourceable2 = new SourceSub2();
        sourceable1.method1();
        sourceable1.method2();

        sourceable2.method1();
        sourceable2.method2();
    }
}
