import java.lang.reflect.GenericArrayType;

public class SelectionSort2 {

    private SelectionSort2() {    }

    public static <E extends Comparable<E>> void sort(E[] arr){

        // 循环不变量是什么     arr[0:i)有序，arr[i:n)无序
        for(int i = 0; i < arr.length; i++) {
            int min_index = i;
            for(int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min_index]) < 0 ) {
                    min_index = j;
                }
            }
            swap(arr, min_index, i);
        }

    }

    public static  <E extends Comparable<E>> void sort2(E[] arr) {
        // 循环不变量：arr[0, i]无序，arr(i, n)有序
        for (int i = arr.length - 1; i >= 0; i--) {
            int max_index = i;
            for (int j = i; j >= 0; j --) {
                if (arr[j].compareTo(arr[max_index]) > 0) {
                    max_index = j;
                }
            }
            swap(arr, i, max_index);
        }
    }

    public static <E> void swap(E[] arr, int src_index, int dic_index) {
        E temp = arr[src_index];
        arr[src_index] = arr[dic_index];
        arr[dic_index] = temp;
    }

    public static void main(String[] args) {
        Integer[] data = {10,2};
        swap(data, 0, 1);
        for (Integer i : data){
            System.out.println(i);
        }

        Integer[] arr = ArrayGenerator.generatorRandomArray(5000, 100000);
//        ArrayUtils.printArray(arr);
        System.out.println(SortingHelper.isSorted(arr));
//        SelectionSort2.sort(arr);
        SelectionSort2.sort2(arr);
        System.out.println(SortingHelper.isSorted(arr));
//        ArrayUtils.printArray(arr);


    }
}