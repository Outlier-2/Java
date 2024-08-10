package cn.l13z.DataStructureAndAlgorithms.dataStructure;

import java.util.Comparator;
import java.util.NoSuchElementException;

// 小顶推简单理解版本
class SimpleHeap {
    private final int[] heap;
    private int size;

    public SimpleHeap(int capacity) {
        heap = new int[capacity + 1];
        size = 0;
    }

    public int size() {
        return size;
    }

    int parent(int node) {
        return node / 2;// 向下取整
    }

    int left(int node) {
        return node * 2;
    }

    int right(int node) {
        return node * 2 + 1;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public int peek() {
        return heap[1];
    }

    public void push(int x) {
        heap[++size] = x;
        // 插入堆低上浮
        swim(size);
    }

    public int pop() {
        int res = heap[1];
        heap[1] = heap[size--];
        sink(1);
        return res;
    }

    private void swim(int x) {
        while (x > 1 && heap[parent(x)] > heap[x]) {
            swap(parent(x), x);
            x = parent(x);
        }
    }

    private void sink(int x) {
        while (left(x) <= size || right(x) <= size) {
            int min = x;
            if (left(x) <= size && heap[left(x)] < heap[min]) {
                min = left(x);
            }
            if (right(x) <= size && heap[right(x)] < heap[min]) {
                min = right(x);
            }
            if (min == x) {
                break;
            }
            swap(x, min);
            x = min;
        }
    }
}

public class heap<T> {
    private T[] heap;
    private int size;
    private final Comparator<? super T> comparator;

    public heap(int capacity, Comparator<? super T> comparator) {
        heap = (T[]) new Object[capacity + 1]; // 0 不用
        size = 0;
        this.comparator = comparator;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int parent(int node) {
        return node / 2;
    }

    private int left(int node) {
        return node * 2;
    }

    private int right(int node) {
        return node * 2 + 1;
    }

    // 交换数组的两个元素
    private void swap(int i, int j) {
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException(" underflow");
        }
        return heap[1];
    }

    public void push(T x) {
        if (size == heap.length - 1) {
            resize(2 * heap.length);
        }
        heap[++size] = x;
        swim(size);
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("underflow");

        }
        T res = heap[1];
        swap(1, size--);
        sink(1);
        heap[size + 1] = null;
        if (size > 0 && size == (heap.length - 1) / 4) {
            resize(heap.length / 2);
        }
        return res;

    }

    private void swim(int k) {
        while (k > 1 && comparator.compare(heap[parent(k)], heap[k]) > 0) {
            swap(parent(k), k);
            k = parent(k);
        }
    }

    private void sink(int k) {
        while (left(k) <= size) {
            int j = left(k);
            if (j < size && comparator.compare(heap[j], heap[j + 1]) > 0)
                j++;
            if (comparator.compare(heap[k], heap[j]) <= 0)
                break;
            swap(k, j);
            k = j;
        }
    }

    private void resize(int capacity) {
        assert capacity > size;
        T[] temp = (T[]) new Object[capacity];
        for (int i = 0; i <= size; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }
}