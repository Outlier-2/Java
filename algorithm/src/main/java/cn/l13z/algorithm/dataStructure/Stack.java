package cn.l13z.algorithm.dataStructure;
import java.util.*;

// 使用数组实现栈
class ArrayStack<E> {
    private ArrayList<E> list = new ArrayList();

    // 插入
    public void push(E element) {
        list.add(element);
    }

    // 删除
    public E pop() {
        return list.remove(list.size() - 1);
    }

    // 查看栈顶
    public E peek() {
        return list.get(list.size() - 1);
    }

    // 返回栈中的元素个数
    public int size() {
        return list.size();
    }

}


/**
 * Stack 链表实现
 */
class ListNodeStack<E> {
    private LinkedList<E> list = new LinkedList();
 
    public void push(E e) {
        list.addLast(e);
    }

    public E pop() {
        return list.removeLast();
    }

    public E peek() {
        return list.getLast();
    }
    public int size() {
        return list.size();
    }
}