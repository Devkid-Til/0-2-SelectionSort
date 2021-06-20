import java.util.Arrays;

public class SelectionSort {
    private SelectionSort() {
    }

        public static <E extends Comparable<E>> void sort(E[] arr) {
        // 循环不变量
        // 1 + 2 + 3 +...+n = n/2(1+n)  -->  O(n^2)
        for (int i = 0; i < arr.length; i++) {
            // array[i, n)未排序
            int min_index = i;
            for (int j = i; j < arr.length; j++) {
                // 在array[i, n)中选择最小的元素
                if (arr[j].compareTo(arr[min_index]) < 0)
                    min_index = j;
            }
            // 将最小的位置放在array[i]
            swap(arr, i, min_index);
        }

    }
    public static <E extends Comparable<E>> void sort2(E[] arr) {
        // arr[i, n)
        for (int i = arr.length - 1; i >= 0; i--) {
            int max_index = i;
            // arr[0, i)
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j].compareTo(arr[max_index]) > 0)
                    max_index = j;
            }
            swap(arr, i, max_index);
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            Integer[] data = ArrayGenerator.generatorRandomArray(n, n);
            SortingHelper.sortTest("SelectionSort", data);
        }

    }

}


