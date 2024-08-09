package cn.l13z.DataStructureAndAlgorithms.dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

    @Override
    public String toString() {
        return "BinaryTree{" + "root=" + toString(this.tree) + '}';
    }

    private String toString(BinaryNode node) {
        if (node == null) {
            return "null";
        }
        return "BinaryNode{" +
                "val=" + node.val +
                ", left=" + toString(node.left) +
                ", right=" + toString(node.right) +
                '}';
    }

    // 遍历
    void traverse(BinaryNode tree) {
        if (tree == null)
            return;

        // 前序位置
        traverse(tree.left);
        // 中序位置
        traverse(tree.right);
        // 后序位置
    }

    // 前序遍历
    @SuppressWarnings("unchecked")
    static void perOrderTraverse(BinaryNode root) {
        @SuppressWarnings("rawtypes")
        ArrayList arr = new ArrayList();

        if (root == null)
            return;
        arr.add(root.val);
        perOrderTraverse(root.left);
        perOrderTraverse(root.right);

    }
    // 中序后序省略

    // 层次遍历
    static void levelOrderTraverse(BinaryNode root) {
        if (root == null) {
            return;
        }

        Queue<BinaryNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            BinaryNode cur = q.poll();
            System.out.println(cur.val);

            if (cur.left != null) {
                q.offer(cur.left);
            }
            if (cur.right != null) {
                q.offer(cur.right);
            }

        }

    }

    // 记录层次的LeveOrdertraverse
    static void levelOrderTraverseDepth(BinaryNode root) {
        if (root == null)
            return;
        Queue<BinaryNode> q = new LinkedList<>();

        q.offer(root);
        int depth = 1;

        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                BinaryNode cur = q.poll();
                System.out.println("depth: " + depth + " val: " + cur.val);

                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
            depth++;

        }
    }

    public static void main(String[] args) {

        BinaryNode rootNode = new BinaryNode(1);
        BinaryTree root = new BinaryTree();
        root.tree = rootNode;
        root.tree.left = new BinaryNode(-1);
        root.tree.right = new BinaryNode(2);
        // root.tree.left.left = new BinaryNode(3);
        // root.tree.left.right = new BinaryNode(4);
        // root.tree.left.right.right = new BinaryNode(5);

        System.out.println(root.toString());

        perOrderTraverse(root.tree);
        levelOrderTraverse(root.tree);
        levelOrderTraverseDepth(root.tree);
    }
}
