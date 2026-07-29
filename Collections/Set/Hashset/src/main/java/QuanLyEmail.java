import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class QuanLyEmail {
        private Set<String> danhSachEmail = new HashSet<String>();

        public boolean themEmail(String email){
            return this.danhSachEmail.add(email);
        }

        public boolean xoaEmail(String email){
            return this.danhSachEmail.remove(email);
        }

        public boolean kiemTraEmail(String email){
            return this.danhSachEmail.contains(email);
        }

        public void hienThi(){

            if(danhSachEmail.isEmpty()){
                System.out.println("Danh sach rong");
                return;
            }

            System.out.println("Danh sach email:");

            for(String email : danhSachEmail){
                System.out.println(email);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            QuanLyEmail ql = new QuanLyEmail();
            int choice;
            do {
                System.out.println("MENU");
                System.out.println("1. Them email");
                System.out.println("2. Xoa email");
                System.out.println("3. Kiem tra email");
                System.out.println("4. Hien thi");
                System.out.println("Nhan phim khac de thoat chuong trinh");
                System.out.print("Chon: ");
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice){
                    case 1:
                        System.out.print("Nhap email: ");
                        String email = sc.nextLine();
                        if(ql.themEmail(email)){
                            System.out.println("Them thanh cong");
                        } else {
                            System.out.println("Email da ton tai");
                        }
                        break;
                    case 2:
                        System.out.print("Nhap email: ");
                        String email1 = sc.nextLine();
                        if(ql.xoaEmail(email1)){
                            System.out.println("Xoa thanh cong");
                        } else {
                            System.out.println("Khong co email can xoa");
                        }
                        break;
                    case 3:
                        System.out.print("Nhap email: ");
                        String email3 = sc.nextLine();
                        if(ql.kiemTraEmail(email3)){
                            System.out.println("Email ton tai trong he thong");
                        } else {
                            System.out.println("Email khong ton tai");
                        }
                        break;
                    case 4:
                        ql.hienThi();
                        break;
                    default:
                        System.out.println("Lua chon khong hop le");
                        break;
                }
            } while(choice!=0);
        }
}
