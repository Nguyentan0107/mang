import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 6, 4, 9, 8, 7, 10,};
        System.out.println(Arrays.toString(arr));
        int total = totalArr(arr);
        System.out.println("Tong = " + total);
        int max = maxArr(arr);
        System.out.println("So lon that = " + max);

    }
    public static int totalArr(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }
    public static int maxArr(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}