
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int indexDelete = 0;
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(array));
        System.out.println("Enter index delete :");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 0; i <= array.length; i++) {
                if (input == array[i]) {
                    indexDelete = i;
                    break;
                }
        }

        for (int j = indexDelete;  j < array.length-1; j++){
            array[j] = array[j + 1];
        }

        System.out.println("Mang sau khi xoa: ");
        for (int i = 0; i < array.length -1; i++) {
            int item = array[i];
            System.out.print(item);
        }
    }
}