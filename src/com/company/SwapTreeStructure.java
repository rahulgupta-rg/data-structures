package com.company;

public class SwapTreeStructure {

    public class TreeNode {

        private int data;
        private TreeNode leftChild;
        private TreeNode rightChild;

        TreeNode(int data ) {
            this.data = data;
        }
    }

    private TreeNode root;

    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
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

    public TreeNode createMirrorImage(TreeNode node) {
        if (node == null) {
            return node;
        }
        TreeNode left = createMirrorImage(node.leftChild);
        TreeNode right = createMirrorImage(node.rightChild);
        node.leftChild = right;
        node.rightChild = left;
        return node;
    }

    public void inOrder(TreeNode node) {

        if (node == null ) {
            return;
        }
        inOrder(node.leftChild);
        System.out.print(node.data+ " ");
        inOrder(node.rightChild);
    }

    public static void main(String[] args) {
        SwapTreeStructure swapTreeStructure = new SwapTreeStructure();
        System.out.println("Creating Tree");
        swapTreeStructure.createBinaryTree();
        System.out.println("Tree Content before reversal");
        swapTreeStructure.inOrder(swapTreeStructure.root);
        swapTreeStructure.createMirrorImage(swapTreeStructure.root);
        System.out.println("\nTree Content after reversal");
        swapTreeStructure.inOrder(swapTreeStructure.root);
    }

}
