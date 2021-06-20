import java.util.Arrays;

public class InsertionSort {

    private InsertionSort() {
    }

    public static <E extends Comparable<E>> void sort2(E[] arr) {

        for (int i = 0; i < arr.length; i++) {
            E temp = arr[i];
            int j;
            for (j = i; j - 1 >= 0 && temp.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;

        }
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        // arr[i, n)有序， arr[0, i)无序
        for (int i = arr.length - 1; i >= 0; i--) {

            E temp = arr[i];
            int j;
            // {6, 4, 5, 3, 4}
            for (j = i + 1; j < arr.length && arr[j].compareTo(temp) < 0; j++) {

                arr[j - 1] = arr[j];
            }
            arr[j - 1] = temp;
        }
    }


    public static void main(String[] args) {

        int[] dataSize = {10000, 100000};
//        int[] dataSize = {5};
        for (int n : dataSize) {
            Integer[] data = ArrayGenerator.generatorOrderedArray(n);
//            Integer[] data2 = Arrays.copyOf(data, data.length);
            SortingHelper.sortTest("InsertionSort", data);
//            SortingHelper.sortTest("InsertionSort2", data2);

        }

    }

}
