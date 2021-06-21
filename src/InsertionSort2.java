import com.sun.org.apache.bcel.internal.generic.SWAP;

public class InsertionSort2 {

    private InsertionSort2() {}
    public static <E extends Comparable<E>> void sort(E[] arr) {

        // 循环不变量： arr[0, i)有序，arr[i, n)无序
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j - 1 >= 0 && arr[j].compareTo(arr[j-1]) < 0; j --){
                swap(arr, j, j-1);
            }
        }
    }

    public static <E extends Comparable<E>> void sort2(E[] arr) {

        for (int i = 0; i < arr.length; i++) {
            E t = arr[i];
            int j;
            for (j = i; j - 1 >= 0 && t.compareTo(arr[j-1]) < 0; j--) {
                arr[j] = arr[j-1];
            }
            arr[j] = t;

        }
    }

    public static <E> void swap(E[] arr, int src_index, int dic_index) {
        E temp = arr[src_index];
        arr[src_index] = arr[dic_index];
        arr[dic_index] = temp;
    }

    public static void main(String[] args) {
        Integer[] data = ArrayGenerator.generatorRandomArray(40000,50000);
//        ArrayUtils.printArray(data);
        System.out.println(SortingHelper.isSorted(data));
        InsertionSort2.sort2(data);
        System.out.println(SortingHelper.isSorted(data));

//        ArrayUtils.printArray(data);
//
    }
}
