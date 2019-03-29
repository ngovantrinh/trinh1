package Assignment4;

public class Main {
    public static void main(String args[]){
        SanPham sanPham1 = new SanPham(1,"San pham 1",3000.0,8);
        SanPham sanPham2 = new SanPham(2,"San pham 2",4000.0,6);
        SanPham sanPham3 = new SanPham(3,"San pham 3",10000.0,1);

        DonHang donHang1 = new DonHang(1);
        donHang1.themSanPham(sanPham1);
        donHang1.themSanPham(sanPham2,20);
        donHang1.themSanPham(sanPham2,20);
        donHang1.themSanPham(sanPham3,80);

        donHang1.inDonHang();
    }
}
