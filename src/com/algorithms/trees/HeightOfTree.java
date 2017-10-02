package com.algorithms.trees;

public class HeightOfTree {


    public static void main(String[] args) {

    }

    private static int treeHeight(TreeNode n) {
        if (n == null) return 0;

        return 1 + Math.max(treeHeight(n.left), treeHeight(n.right));
    }

}
