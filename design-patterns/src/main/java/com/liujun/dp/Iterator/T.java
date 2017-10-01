package com.liujun.dp.Iterator;

import org.junit.Test;


public class T {
    @Test
    public void t() {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while (it.hastNext()) {
            System.out.println(it.next());
        }
    }
}
