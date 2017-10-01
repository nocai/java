package com.liujun.ws.impl;

import com.liujun.ws.MyWebService;

import javax.jws.WebService;

@WebService(endpointInterface = "com.liujun.ws.MyWebService") //,targetNamespace="XXXXXB"
public class MyWebserviceImpl implements MyWebService {
    @Override
    public int add(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));
        return a - b;
    }
}
