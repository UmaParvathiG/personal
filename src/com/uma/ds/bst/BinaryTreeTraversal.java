package com.uma.ds.bst;

/***

Example:

            1
     2              3

4       5       6       7


**/

public class BinaryTreeTraversal {

    // Root of Binary Tree
    TreeNode root;

    BinaryTreeTraversal()
    {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder(tree.root);

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder(tree.root);

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder(tree.root);

    }
    public void printInorder(TreeNode treeNode){
        if(treeNode ==null)
            return;

        printInorder(treeNode.left);
        System.out.println(treeNode.key+" ");
        printInorder(treeNode.right);

    }

    public void printPreorder(TreeNode treeNode){
        if(treeNode ==null)
            return;

        System.out.println(treeNode.key+" ");
        printPreorder(treeNode.left);
        printPreorder(treeNode.right);
    }

    public void printPostorder(TreeNode treeNode){
        if(treeNode ==null)
            return;

        printPostorder(treeNode.left);
        printPostorder(treeNode.right);
        System.out.println(treeNode.key+" ");
    }

    // Wrappers over above recursive functions
    void printPostorder()  {     printPostorder(root);  }
    void printInorder()    {     printInorder(root);   }
    void printPreorder()   {     printPreorder(root);  }



}
