package cn.l13z.algorithm.dataStructure;

/**
 * CycleArray
 */
public class CycleArray<T> {

    private T[] arr;
    private int start;
    /* 我们这里的end是最后元素的后一个值 */
    private int end;
    /* 当前数组中有几个元素 */
    private int count;
    /* 循环数组的容量 */
    private int size;

    @SuppressWarnings("unchecked")
    public CycleArray(int size) {
        this.size = size;
        this.arr = (T[]) new Object[size];
        this.count = 0;
        this.start = 0;
        this.end = 0;
    }

    private void resize(int newSize) {
        @SuppressWarnings("unchecked")
        T[] newArr = (T[]) new Object[newSize];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[(start + i) % size];
        }
        arr = newArr;
        start = 0;
        end = count;
        size = newSize;

    }

    public void addLast(T element) {
        if (isFull()) {
            resize(size * 2);
        }
        arr[end] = element;
        end = (end + 1) % size;
        count++;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Array is empty");
        }

        end = (end - 1 + size) % size;
        arr[end] = null;
        count--;

        if (count > 0 && count == size / 4) {
            resize(size / 2);
        }
    }

    public T removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Array is empty");
        }

        int removeIndex = start;
        T val = arr[removeIndex];
        start = (start + 1) % size;
        arr[removeIndex] = null;
        count--;
        return val;
    }

    
    public T getFirst() {
        if (isEmpty())
            throw new IllegalStateException("Array is empty");
        return arr[start];
    }

    public T getLast() {
        if (isEmpty())
            throw new IllegalStateException("array is empty");
        return arr[(end - 1 + size) % size];
    }

    public boolean isFull() {
        return count == size;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}