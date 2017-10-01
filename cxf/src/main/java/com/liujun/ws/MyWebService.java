package com.liujun.ws;

import javax.jws.WebService;

@WebService//(targetNamespace="XXXXX")
public interface MyWebService {
    int add(int a, int b);

    int minus(int a, int b);
}
