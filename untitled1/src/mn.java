public class mn {
    public int totalPrice(Book[]array){
        int count=0;
        for (Book p:array) {
            count+=p.getPrice();
        }
        System.out.println("Tong tien so sach la:" + count);
        return count;
    }
//    public int totalJava(Book[]array){
//        int count=0;
//        for (Book p:array) {
//            count+=p.;
//        }
//        System.out.println("Tong tien so sach la:" + count);
//        return count;
//    }
}
