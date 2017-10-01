package com.liujun.dp.Proxy1;

public class Proxy implements Sourceable{
    private Sourceable source;

    public Proxy(Sourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        this.before();
        this.source.method();
        this.after();
    }

    private void before() {
        System.out.println("before proxy !");
    }
    public void after() {
        System.out.println("after proxy");
    }
}
