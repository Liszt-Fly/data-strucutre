package MikeTree;

public class Main {
    public static void main(String[] args) {
        MikeTree mikeBinarySearchTree=new MikeTree();
        mikeBinarySearchTree.insert(7);
        mikeBinarySearchTree.insert(4);
        mikeBinarySearchTree.insert(1);
        mikeBinarySearchTree.insert(6);
        mikeBinarySearchTree.insert(8);
        mikeBinarySearchTree.insert(5);
        mikeBinarySearchTree.insert(9);
        mikeBinarySearchTree.traverseInOrder();
        System.out.println(mikeBinarySearchTree.height());
        System.out.println("最小值为: "+mikeBinarySearchTree.min());
        MikeTree mikeBinarySearchTree1=new MikeTree();
        mikeBinarySearchTree1.insert(7);
        mikeBinarySearchTree1.insert(4);
        mikeBinarySearchTree1.insert(1);
        mikeBinarySearchTree1.insert(6);
        mikeBinarySearchTree1.insert(8);
        mikeBinarySearchTree1.insert(5);
        mikeBinarySearchTree1.insert(9);
        mikeBinarySearchTree1.swapRoot();

        System.out.println(mikeBinarySearchTree.equals(mikeBinarySearchTree1));
        System.out.println(mikeBinarySearchTree1.isBinarySearchTree());
        mikeBinarySearchTree.printNodesAtDistance(2);
        mikeBinarySearchTree.traverseLevelOrder();
    }
}
