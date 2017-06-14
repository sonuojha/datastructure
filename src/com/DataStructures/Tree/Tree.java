package com.DataStructures.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by aojha on 5/24/17.
 */



class BinaryTree{
    Node root;
    int value;
    int max = 0;

    BinaryTree(){
        root = null;
    }

    int getMax(){
        return max;
    }

    void printPreorder(com.DataStructures.Tree.Node node){
        if(node == null)
            return;

        System.out.println(node.data);
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void printInOrder(Node node){
        if(node == null)
            return;

        printPreorder(node.left);
        System.out.println(node.data);
        printInOrder(node.right);
    }

    void printPostOrder(Node node){
        if(node == null)
            return;

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(node.data);
    }

    int addHeightToLeaf(Node node){
        if(node == null)
            return 0;

        value = value + node.data;

        if(node.left != null && node.right != null){
            addHeightToLeaf(node.left);
            addHeightToLeaf(node.right);
        }
        return value;
    }

    void levelOrder(Node node){
        if(node == null)
            return;

        Queue<Node> q = new LinkedList<Node>();


        while(true) {
            q.add(node);
            int nodeCount = q.size();

            if (nodeCount == 0)
                break;

            while (!q.isEmpty()) {
                Node temp = q.poll();
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
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

    void maxElement(Node root){
        if(root == null)
            return;

        if(max < root.data){
            max = root.data;
        }
        maxElement(root.left);
        maxElement(root.right);
    }

    void LevelOrderRecurcive(Node node){
        int height = heightOfTree(node);

        for(int i=1; i<=height; i++){
            printGivenLevel(node, i);
            System.out.println();
        }
    }

    int heightOfTree(Node node){
        if(node == null)
            return 0;

        return Math.max(heightOfTree(node.left), heightOfTree(node.right)) +1;
    }


}

public class Tree {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        //tree.root.left.left = new Node(40);
        //tree.root.left.right = new Node(50);
        //tree.root.right.left = new Node(60);
        //tree.root.right.right = new Node(70);
        //System.out.println(tree.addHeightToLeaf(tree.root));
        //System.out.println(tree.heightOfTree(tree.root));
        //tree.LevelOrderRecurcive(tree.root);
        //tree.maxElement(tree.root);
        //System.out.println(tree.getMax());
        //tree.levelOrder(tree.root);
        tree.printPreorder(tree.root);

    }
}
