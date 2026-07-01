package GetterSetter;

public class Main {
    public static void main(String[] args) {
        MyDate md = new MyDate(5,11,-1);
        System.out.println(md);

        md.setDay(14);
        md.setYear(2005);
        System.out.println("Sau khi thay doi: " + md.getDay() + "/" + md.getMonth() + "/" + md.getYear());
        System.out.println(md);
    }
}
