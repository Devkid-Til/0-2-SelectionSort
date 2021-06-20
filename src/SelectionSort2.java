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

        Integer[] arr = ArrayGenerator.generatorRandomArray(1000, 500);
//        ArrayUtils.printArray(arr);
        System.out.println(SortingHelper.isSorted(arr));
        SelectionSort2.sort(arr);
        System.out.println(SortingHelper.isSorted(arr));
//        ArrayUtils.printArray(arr);


    }
}