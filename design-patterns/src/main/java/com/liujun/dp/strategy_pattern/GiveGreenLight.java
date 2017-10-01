package com.liujun.dp.strategy_pattern;

public class GiveGreenLight implements IStrategy {
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行！");
    }
}
