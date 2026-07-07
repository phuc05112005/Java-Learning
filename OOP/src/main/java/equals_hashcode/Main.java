package equals_hashcode;

public class Main {
    public static void main(String[] args) {
        MyDate md = new MyDate(5,11,2005);
        MyDate md1 = new MyDate(13,11,2004);
        MyDate md2 = new MyDate(5,11,2005);

        System.out.println(md.equals(md1));
        System.out.println(md.equals(md2));

        System.out.println(md.hashCode());
        System.out.println(md1.hashCode());
        System.out.println(md2.hashCode());
    }
}
