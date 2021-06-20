public class ArrayUtils {
    private ArrayUtils() {}

    public static <E> void printArray(E[] arr) {
        System.out.println("数组长度为"+ arr.length);
        for (E i : arr) {
            System.out.println(i);
        }
    }
}
