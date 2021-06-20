import java.util.Random;

public class ArrayGenerator {
    private ArrayGenerator() {}
    // 生成一个长度为n的有序数组
    static public Integer[] generatorOrderedArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n - i - 1;
        }
        return arr;
    }
    // 生成一个长度为n的su随机数组，每个数字范围是[0, bound)
    static public Integer[] generatorRandomArray(int n, int bound) {
        Integer[] arr = new Integer[n];
        Random rdm = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rdm.nextInt(bound);
        }
        return arr;
    }
}
