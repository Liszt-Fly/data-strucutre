package MikeTree;

import java.util.ArrayList;

public class MikeBinarySearchTree {
    private Node root;

    private class Node {
        private final int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value) {
        //generate node
        var node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        var current = root;
        while (true) {
            if (value > current.value) {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            } else {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }
        }
        ;
        current = node;
    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value) {
                current = current.leftChild;
            } else if (value > current.value) {
                current = current.rightChild;
            } else {
                return true;
            }

        }
        return false;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null) return;
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if (root == null) return;

        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root == null) return;
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }

    public int height() {

        return height(root);
    }

    private int height(Node root) {
        if (root == null) return -1;
        if (root.leftChild == null && root.rightChild == null) return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public int min() {
        return min(root);
    }

    private int min(Node root) {

        if (root.leftChild == null && root.rightChild == null) return root.value;
        if (root.leftChild != null && root.rightChild == null) return Math.min(root.leftChild.value, root.value);
        if (root.rightChild != null && root.leftChild == null) return Math.min(root.rightChild.value, root.value);

        var left = min(root.leftChild);
        var right = min(root.rightChild);
        return Math.min(Math.min(left, right), root.value);
    }

    public boolean equals(MikeBinarySearchTree other) {
        if (other == null) return false;
        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null) {
            return true;
        }
        if (first != null && second != null) {
            return first.value == second.value
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);
        }
        return false;
    }

    public boolean isBinarySearchTree() {
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public void swapRoot() {
        var temp = root.leftChild;
        root.leftChild = root.rightChild;
        root.rightChild = temp;
    }

    private boolean isBinarySearchTree(Node root, int min, int max) {
        if (root == null) return true;
        return root.value > min && root.value < max
                && isBinarySearchTree(root.leftChild, min, root.value)
                && isBinarySearchTree(root.rightChild, root.value, max);
    }

    public ArrayList<Integer> printNodesAtDistance(int distance) {
        var list=new ArrayList<Integer>();
            if(root==null){
                return null;
            }
            printNodesAtDistance(root,distance,list);

        return list;
    }

    private void printNodesAtDistance(Node root,int distance,ArrayList<Integer>arrayList){
        if(root==null) return;
           if(distance==0) {

               arrayList.add(root.value);
               return;
           }
           printNodesAtDistance(root.leftChild,distance-1,arrayList);
           printNodesAtDistance(root.rightChild,distance-1,arrayList);

    }

    public void traverseLevelOrder(){
        System.out.println("高度:"+height());
        for(var i=0;i<=height();i++){

            for(var value: printNodesAtDistance(i)){
                System.out.println("第"+i+"层"+value);
            }
        }
    }

}