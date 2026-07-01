package construtor;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(){

    }

    public MyDate(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public void PrintDay(){
        System.out.println("Ngay: " + this.day);
    }

    public void PrintMonth(){
        System.out.println("Thang: " + this.month);
    }

    public void PrintYear(){
        System.out.println("Nam: " + this.year);
    }
}
