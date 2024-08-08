package cn.l13z.algorithm.dataStructure;

class BinaryNode {
    int val;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    BinaryNode tree;

    public BinaryTree() {
        this.tree = null;
    }

    public static void main(String[] args) {

        BinaryNode rootNode = new BinaryNode(1);
        BinaryTree root = new BinaryTree();
        root.tree = rootNode;
        System.out.println(root.tree.val);
    }
}
