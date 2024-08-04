package cn.l13z.algorithm.dataStructure;

import java.util.LinkedList;

// 数组实现队列
class ArrayQueue<E> {

    private CycleArray<E> list = new CycleArray<>(1);

    // 向栈顶加入元素，时间复杂度 O(1)
    public void push(E e) {
        list.addLast(e);
    }

    // 从栈顶弹出元素，时间复杂度 O(1)
    public E pop() {
        return list.removeFirst();
    }

    // 查看栈顶元素，时间复杂度 O(1)
    public E peek() {
        return list.getFirst();
    }

    // 返回栈中的元素个数，时间复杂度 O(1)
    public int size() {
        return list.size();
    }
}

class ListNodeQueuek<E> {
    private LinkedList<E> list = new LinkedList();

    public void push(E e) {
        list.addLast(e);
    }

    public E pop() {
        return list.removeFirst();
    }

    public E peek() {
        return list.getLast();
    }

    public int size() {
        return list.size();
    }
}