package DP_13_Composite;

import java.util.Enumeration;

/**
 * 组合模式：在处理类似树形结构的问题时比较方便。
 * 使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
 * Created by wuwg on 2016/8/31.
 */
public class Tree {

    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);

        System.out.println("build the tree finished!");
    }
}
