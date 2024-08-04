package cn.l13z.algorithm.dataStructure;

public class MyListNode<E> {
    // 虚拟的头节点与尾节点
    final private Node<E> head, tail;

    private int size;

    // 双链表节点
    private static class Node<E> {
        E val;
        Node<E> next;
        Node<E> prev;

        Node(E val) {
            this.val = val;
        }
    }

    public MyListNode() {
        this.head = new Node<>(null);
        this.tail = new Node<>(null);

        head.next = tail;
        tail.prev = head;

        this.size = 0;
    }

    // 头插法
    public void addFirst(E e) {
        Node<E> targetNode = new Node<>(e);
        Node<E> temp = head.next;

        temp.prev = targetNode;
        targetNode.next = head;
        size++;
    }

    // 删除
    public E removeFirst() throws IllegalAccessException {
        if (size < 1) {
            throw new IllegalAccessException("index is erro");
        }

        Node<E> targetNode = head.next;
        Node<E> temp = targetNode.next;

        head.next = temp;
        temp.prev = head;

        targetNode.next = null;
        targetNode.prev = null;

        size--;
        return temp.val;
    }

    
}