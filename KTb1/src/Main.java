import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Cạnh Dáy Nhỏ: ");
        double cdn = scanner.nextDouble();
        System.out.println("Nhập Cạnh Dáy Lớn: ");
        double cdl = scanner.nextDouble();
        System.out.println("Nhập Cạnh Bên 1: ");
        double cb1 = scanner.nextDouble();
        System.out.println("Nhập Cạnh Bên 2: ");
        double cb2 = scanner.nextDouble();
        System.out.println("Nhập Chiều Cao: ");
        double h = scanner.nextDouble();
        Trapezoid trapezoid = new Trapezoid(cdl,cdn,cb2,cb1,h);
        if(cdn >0 && cdl >0 && cb1>0 && cb2>0 && h > 0){
            System.out.println("Chu vi hinh chữ nhật là: " + trapezoid.getCv());
            System.out.println("Diên tich  chữ nhật là: " + trapezoid.gettDt());
        } else {
            System.out.println("Không nhập số 0 nhỏ hơn 0:");
        }

    }
}