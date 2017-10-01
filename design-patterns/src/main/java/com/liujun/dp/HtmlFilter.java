package com.liujun.dp;

public class HtmlFilter  implements Filter{

    public String doFilter(String msg) {
        String result = msg.replace("<", "[").replace(">", "]");
        return result;
    }
}
