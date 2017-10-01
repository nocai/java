package com.liujun.dp.Strategy;

import org.junit.Test;

public class T {
    @Test
    public void t() {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}  