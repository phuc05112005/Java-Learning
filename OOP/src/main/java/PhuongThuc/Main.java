package PhuongThuc;

public class Main {
    public static void main(String[] args) {
        HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen", 100000, 3.5);

        System.out.println("Tong tien: " + hd.tinhTong());
        System.out.println("Ca phe tren 2kg: " + hd.kiemTra(2));
        System.out.println("Kiem tra tong tien lon hon 300k: " + hd.kiemTraTongTienLonHon300());
        System.out.println("Giam gia: " + hd.giamGia(10));
        System.out.println("Gia sau khi giam: " + hd.giaSauGiam(10));
    }
}
