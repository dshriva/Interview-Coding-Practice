package com.example.leetcode.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * created by divya at 7/31/2018
 */
public class PreorderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        TreeNode r1 = new TreeNode(1);
        TreeNode l1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);
        TreeNode l2 = new TreeNode(4);
        TreeNode r3 = new TreeNode(5);
        TreeNode l3 = new TreeNode(6);
        TreeNode r4 = new TreeNode(8);
        TreeNode l4 = new TreeNode(9);

        root.left = l1;
        root.right = r1;

        l1.left = l2;
        l1.right = r2;

        r1.left = l3;
        r1.right = r3;

        r2.left = l4;
        r2.right = r4;

        List<Integer> retList = preorderTraversalRecursive(root);
        for (int i : retList) {
            System.out.println(i);
        }

        System.out.println("-----------");

        retList.clear();
        retList = preorderTraversalUsingStack(root);
        for (int i : retList) {
            System.out.println(i);
        }
    }

    public static List<Integer> preorderTraversalRecursive(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        preorder(root, list);

        return list;
    }

    private static void preorder(TreeNode node, List<Integer> list){
        if(node == null) return;

        list.add(node.val);
        preorder(node.left, list);
        preorder(node.right, list);


    }

    public static List<Integer> preorderTraversalUsingStack(TreeNode root) {
        List<Integer> list = new  ArrayList<Integer>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode node = root;
        stack.push(node);
        while(!stack.empty()){
            node = stack.pop();
            list.add(node.val);
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }
        return list;
    }
}
