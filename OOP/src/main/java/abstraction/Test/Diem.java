package abstraction.Test;

public class Diem extends Hinh{
    public Diem(ToaDo toaDo) {
        super(toaDo);
    }

    @Override
    public double tinhDienTinh() {
        return 1;
    }
}
