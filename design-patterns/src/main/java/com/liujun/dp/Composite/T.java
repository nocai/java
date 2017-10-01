package com.liujun.dp.Composite;

import org.junit.Test;

public class T {


    @Test
    public void t() {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.getRoot().add(nodeB);

        System.out.println("build the tree finished!");
    }
}
