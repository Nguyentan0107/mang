public class Sanpham {
    private int masp;
    private String tensp;
    private double giasp;
    private int soluongsp;
    private double khuyenmai;
    public Sanpham(int masp, String tensp, double giasp, int soluongsp, double khuyenmai) {
        this.masp = masp;
        this.tensp = tensp;
        this.giasp = giasp;
        this.soluongsp = soluongsp;
        this.khuyenmai = khuyenmai;
    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public double isGiasp() {
        return giasp;
    }

    public void setGiasp(double giasp) {
        this.giasp = giasp;
    }

    public int getSoluongsp() {
        return soluongsp;
    }

    public void setSoluongsp(int soluongsp) {
        this.soluongsp = soluongsp;
    }

    public double isKhuyenmai() {
        return khuyenmai;
    }

    public void setKhuyenmai(double khuyenmai) {
        this.khuyenmai = khuyenmai;
    }
    public double getAmountAfterDiscount() {
        return giasp * (1 - khuyenmai / 100) * soluongsp;
    }
    public double getAmount() {
        return giasp * soluongsp;
    }


    @Override
    public String toString() {
        return "Mã sản phẩm=" + masp +
                ", tên sản phầm: " + tensp +
                ", giá: " + giasp +
                ", số lượng: " + soluongsp +
                ", giảm giá: " + khuyenmai + "%";
    }
}
