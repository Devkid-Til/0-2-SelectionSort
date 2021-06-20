import java.util.Arrays;

public class SortingHelper {

    private SortingHelper() {
    }

    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0)
                return false;
        }
        return true;
    }

    public static <E extends Comparable<E>> void sortTest(String sort_name, E[] arr) {
//        System.out.println(Arrays.toString(arr));
        long start_time = System.nanoTime();
//        if (sort_name.equals(SelectionSort.class))

        if (sort_name.equals("SelectionSort"))
            SelectionSort.sort(arr);
        else if (sort_name.equals("InsertionSort"))
            InsertionSort.sort(arr);
//        else if (sort_name.equals("InsertionSort2"))
//            InsertionSort.sort2(arr);

        long end_time = System.nanoTime();
        double time = (end_time - start_time) / 0.1e11;
//        System.out.println(Arrays.toString(arr));
        if (!SortingHelper.isSorted(arr)) throw new RuntimeException(sort_name + " Failed!");
        System.out.format(sort_name + ":n=%d, Used time:%fs\n", arr.length, time);
    }
}
