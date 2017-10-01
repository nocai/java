package com.liujun.dp.ChainOfResponsibility;

/**
 * Created by JunLiu on 2017/5/17.
 */
public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {

        System.out.println(this.name + " deal !");
        Handler handler = this.getHandler();
        if (handler != null) {
            handler.operator();
        }
        System.out.println(this.name + "end !");
    }
}
