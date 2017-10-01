package com.liujun.dp.TemplateMethod;

import org.junit.Test;

public class T {
    @Test
    public void t() {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
