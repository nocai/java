package com.liujun.dp.Proxy1;

public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("the original method !");
    }
}
