package com.liujun.dp.Bridge;

public abstract class Bridge {
    private Sourceable source;

    public void method() {
        this.source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
