public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int i1 = 4;

        Sanpham[] sanphams = new Sanpham[4];
        sanphams[0] = new Sanpham(1,"spa",190,1,2);
        sanphams[1] = new Sanpham(1,"spb",190,1,2);
        sanphams[2] = new Sanpham(1,"spc",190,1,2);
        sanphams[3] = new Sanpham(1,"spd",190,1,2);


        for (int i = 0; i < sanphams.length; i++){
            System.out.println(sanphams[i].toString());
        }
        Main main = new Main();
        System.out.println("\nGiá trước khuyến mãi: " + main.getTotalAmount(sanphams));
        System.out.println("\nGiá sau khi đã giảm khuyến mãi: "+main.getAmountAfterDiscount(sanphams));
        System.out.println("\nTiền chênh lệch: " + (main.getTotalAmount(sanphams)-main.getAmountAfterDiscount(sanphams)));
    }

    public double getTotalAmount(Sanpham[] products){
        double totalAmount=0;
        for (int i = 0; i < products.length; i++){
            totalAmount += products[i].getAmount();
        }
        return totalAmount;
    }



    public double getAmountAfterDiscount(Sanpham[] products) {
        double totalAmountAfterDiscount=0;
        for (int i = 0; i < products.length; i++){
            totalAmountAfterDiscount += products[i].getAmountAfterDiscount();
        }
        return totalAmountAfterDiscount;
    }
}