package abstraction.Test;

public class Main {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(5,5);
        ToaDo td2 = new ToaDo(9,10);
        ToaDo td3 = new ToaDo(3,4);

        // Hinh hinh1 = new Hinh(td1); ==> Error

        Hinh h1 = new Diem(td1);
        Hinh h2 = new HinhTron(td2,15);
        Hinh h3 = new HinhChuNhat(td3,6,8);

        System.out.println(h1.tinhDienTinh());
        System.out.println(h2.tinhDienTinh());
        System.out.println(h3.tinhDienTinh());

    }
}
