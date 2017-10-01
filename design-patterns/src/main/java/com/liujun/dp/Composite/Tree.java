package com.liujun.dp.Composite;

public class Tree {
    private TreeNode root = null;

    public Tree(String name) {
        this.root = new TreeNode(name);
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
