import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int input = scanner.nextInt();
        int n = 2;
        while (n < input) {
            if (primeNumber(n)) {
                System.out.print(n + ",");
            }
            n++;
        }
    }

public static boolean primeNumber(int i) {
    if (i < 2) {
        return false;
    }
    for (int j = 2; j <= i - 1; j++) {
        if (i % j == 0) {
            return false;
        }
    }
    return true;

  }
}