package com.algorithms.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BreadthFirstSearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        TreeNode tree = TreeNode.arrayToTree(arr);

        breadthFirstSearch2(tree);
    }

    private static void breadthFirstSearch(TreeNode root) {

        LinkedList<TreeNode> nextToVisit = new LinkedList<>();

        nextToVisit.add(root);

        while (!nextToVisit.isEmpty()) {
            TreeNode node = nextToVisit.remove();

            if (node.left != null) {
                nextToVisit.add(node.left);
            }

            if (node.right != null) {
                nextToVisit.add(node.right);
            }

            node.printValue();
        }
    }

    private static void breadthFirstSearch2(TreeNode node) {
        List<TreeNode> al = new ArrayList<>();
        al.add(node);
        while (!al.isEmpty()) {
            node = al.get(0);
            if (node.left != null) {
                int index = al.size();
                al.add(index, node.left);
            }
            if (node.right != null) {
                int index = al.size();
                al.add(index, node.right);
            }
            al.get(0).printValue();
            al.remove(0);

        }
    }


}