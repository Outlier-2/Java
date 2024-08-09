package cn.l13z.DataStructureAndAlgorithms.dataStructure;

/**
 * ClassName: Array.java <br>
 *
 * @author AlfredOrlando <br>
 * <p>
 * Created: 2024-04-09 08:17 <br> Description: 基本数组的操作 <br>
 * <p>
 * Modification History: <br> - 2024/4/9 AlfredOrlando 基本数组的操作 <br>
 */
public class Array {

    public int[] arr;
    private int size;

    // 创建
    public Array(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    // 增加元素
    public void add(int element) {
        if (size < arr.length) {
            arr[size] = element;
            size++;
        } else {
            System.out.println("数组无法添加元素");
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; 1 < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;

        } else {
            System.out.println("索引越界");
        }
    }

    public void  set(int index, int element){
        if (index >= 0 && index < size){
            arr[index] = element;
        }else {
            System.out.println("索引越界");
        }
    }

    public int get(int index){
        if (index >= 0 && index < size){
            return arr[index];
        }else {
            System.out.println("索引越界");
            return -1;
        }
    }

    public int getSize(){
        return size;
    }
}
