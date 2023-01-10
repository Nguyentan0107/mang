import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = scanner.nextInt();
        System.out.print("Nhap b: ");
        double b = scanner.nextInt();
        System.out.print("Nhap c: ");
        double c = scanner.nextInt();
        QuadraticEquation pt=new QuadraticEquation(a,b,c);
        if (a == 0) {
            System.out.println("Nhap so khac # 0 :  ");
        }else if(pt.getDiscriminant() < 0) {
            System.out.println("Phuong trinh vo nghiem:");
        } else if(pt.getDiscriminant() == 0 ) {
            System.out.println("Phuong trinh co nghiem kep:" + " " + pt.getRoot3());
        }else if (pt.getDiscriminant() > 0){
            System.out.println("phuong trinh co 2 nghiem la " + " " + pt.getRoot1()+" ,"+ pt.getRoot2());
        }
    }
}