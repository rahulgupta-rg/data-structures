package com.company.binaryTree;

public class BinaryTreeTraversal {

    public static class TreeNode {

        private int data;
        private TreeNode leftChild;
        private TreeNode rightChild;

        public TreeNode(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public TreeNode getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(TreeNode leftChild) {
            this.leftChild = leftChild;
        }

        public TreeNode getRightChild() {
            return rightChild;
        }

        public void setRightChild(TreeNode rightChild) {
            this.rightChild = rightChild;
        }
    }

    private TreeNode root;

    public void createBinaryTree() {
        BinaryTreeTraversal.TreeNode first = new BinaryTreeTraversal.TreeNode(1);
        BinaryTreeTraversal.TreeNode second = new BinaryTreeTraversal.TreeNode(2);
        BinaryTreeTraversal.TreeNode third = new BinaryTreeTraversal.TreeNode(3);
        BinaryTreeTraversal.TreeNode fourth = new BinaryTreeTraversal.TreeNode(4);
        BinaryTreeTraversal.TreeNode fifth = new BinaryTreeTraversal.TreeNode(5);
        // TreeNode sixth = new TreeNode(6);
        // TreeNode seventh = new TreeNode(7);
        root = first;
        first.leftChild = second;
        first.rightChild = third;
        second.leftChild = fourth;
        second.rightChild = fifth;
        //third.leftChild = sixth;
        //third.rightChild = seventh;
    }

    public static void main(String[] args) {

    }
}
