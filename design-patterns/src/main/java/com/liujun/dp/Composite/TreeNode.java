package com.liujun.dp.Composite;

import java.util.Enumeration;
import java.util.Vector;

public class TreeNode {
    public String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<>();

    public void add(TreeNode node) {
        this.children.add(node);
    }

    public void remove(TreeNode node) {
        this.children.remove(node);
    }

    //取得孩子节点
    public Enumeration<TreeNode> getChildren() {
        return children.elements();
    }

    public TreeNode(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
}
