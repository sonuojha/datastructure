package com.DataStructures.Tree;

/**
 * Created by aojha on 6/7/17.
 */
class BinarySearchTree{
    Node createNode(int data, Node root){
        if(root == null){
            root = getNewNode(data);
        }
        if(root.data > data){
            root.left = createNode(data, root.left);
        }
        else{
            root.left = createNode(data, root.left);
        }
        return root;
    }

    private Node getNewNode(int data) {
        Node n = new Node();
        n.data = data;
        n.left = null;
        n.right = null;

        return n;
    }

    void printGivenLevel(Node node, int level){
        if(node == null)
            return;
        if(level == 1)
            System.out.print(node.data +  " ");
        if (level > 1){
            printGivenLevel(node.left, level-1);
            printGivenLevel(node.right, level-1);
        }
    }
}


public class BST {
    public static void main(String[] args) {
        Node root = null;
        BinarySearchTree bst = new BinarySearchTree();
        root = bst.createNode(10, root);
        root = bst.createNode(20, root);
        root = bst.createNode(30, root);
        bst.printGivenLevel(root, 2);
    }
}
