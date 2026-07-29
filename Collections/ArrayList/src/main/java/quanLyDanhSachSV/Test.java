package quanLyDanhSachSV;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSV danhSachSV = new DanhSachSV();

        int luaChon;
        do{
            System.out.println("---MENU---");
            System.out.println(
                    "1.   Thêm sinh viên vào danh sách.\n"
                            + "2.   In danh sách sinh viên ra màn hình.\n"
                            + "3.   Kiểm tra danh sách có rỗng hay không.\n"
                            + "4.   Lấy ra số lượng sinh viên trong danh sách.\n"
                            + "5.   Làm rỗng danh sách sinh viên.\n"
                            + "6.   Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                            + "7.   Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                            + "8.   Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
                            + "9.   Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                            + "10.  Ghi du lieu danh sach xuong file.\n"
                            + "11.  Doc du lieu trong file.\n"
                            + "0.   Thoát chương trình."
            );
            System.out.print("Nhap chon: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon == 1){
                System.out.print("Nhap ma sinh vien: ");
                String maSV = sc.nextLine();
                System.out.print("Nhap ho va ten: ");
                String hoVaTen = sc.nextLine();
                System.out.print("Nhap nam sinh: ");
                int namSinh = sc.nextInt();
                System.out.print("Nhap diem trung binh: ");
                double diemTB = sc.nextDouble();
                SinhVien sv = new SinhVien(maSV, hoVaTen, namSinh, diemTB);
                danhSachSV.themSinhVien(sv);
            } else if (luaChon == 2) {
                System.out.println("Danh sach sinh vien:");
                danhSachSV.inDanhSanhSV();
            } else if (luaChon == 3) {
                System.out.println("Danh sach sinh vien co trong khong: " + danhSachSV.kiemTraRong());
            } else if (luaChon == 4) {
                System.out.println("So luong sinh vien trong danh sach: " + danhSachSV.demSinhVien());
            } else if(luaChon == 5){
                danhSachSV.lamRongDanhSach();
                System.out.println("Da xoa tat ca sinh vien trong danh sach!");
            } else if (luaChon == 6) {
                System.out.print("Nhap vao ma sinh vien can tim: ");
                String maSV = sc.nextLine();
                SinhVien sinhVien = new SinhVien(maSV);
                if(danhSachSV.kiemTraSV(sinhVien)){
                    System.out.println("Sinh vien can tim co trong danh sach");
                } else {
                    System.out.println("Sinh vien can tim khong co trong danh sach");
                }
            } else if (luaChon == 7) {
                System.out.print("Nhap vao ma sinh vien can xoa: ");
                String maSV = sc.nextLine();
                SinhVien sinhVien = new SinhVien(maSV);
                danhSachSV.xoaSinhVien(sinhVien);
                System.out.println("Da xoa sinh vien khoi danh sach! ");
            } else if (luaChon == 8){
                System.out.print("Nhap ten sinh vien can tim:" );
                String ten = sc.nextLine();
                danhSachSV.timKiemSV(ten);
            } else if(luaChon==9){
                danhSachSV.sapXepSinhVienGiamDanTheoDiem();
                danhSachSV.inDanhSanhSV();
            } else if(luaChon==10){
                System.out.print("Nhap ten file: ");
                String s = sc.nextLine();
                File f = new File(s);
                danhSachSV.ghiDuLieuXuongFile(f);
            } else if(luaChon==11){
                System.out.print("Nhap ten file: ");
                String s = sc.nextLine();
                File f = new File(s);
                danhSachSV.docDuLieuFile(f);
            }
        } while(luaChon != 0);


    }
}
