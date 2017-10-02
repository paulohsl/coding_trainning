package com.algorithms.trees;

public class TreeNode {

    private int value;
    public boolean visited;

    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.visited = false;
    }

    public void printValue() {
        System.out.println(this.value);
    }

    public static TreeNode arrayToTree(int[] arr) {

        if (arr.length == 0) return null;

        return arrayToTree(arr, 0, arr.length - 1);
    }

    private static TreeNode arrayToTree(int[] arr, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = arrayToTree(arr, start, mid - 1);
        root.right = arrayToTree(arr, mid + 1, end);

        return root;
    }
}
