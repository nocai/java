package com.liujun.ws.impl;

import com.liujun.ws.HelloWorld;

import javax.jws.WebService;

@WebService(endpointInterface = "com.liujun.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String sayHi(String text) {
        System.out.println("syaHi called");
        return "Hello " + text;
    }
}
