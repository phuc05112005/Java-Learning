package equals_hashcode;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int d, int m, int y){
        if(d>=1 && d<=31){
            this.day = d;
        }
        else{
            this.day = 1;
        }

        if(m>=1 && m <=12){
            this.month = m;
        }
        else {
            this.month = 1;
        }

        if(y>=0){
            this.year = y;
        }
        else{
            this.year = 1;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int d) {
        if(d>=1 && d<=31)
            this.day = d;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int m) {
        if(m>=1 && m <=12)
            this.month = m;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        if(y>0)
            this.year = y;
    }

    @Override
    public String toString() {
        return this.day +  "/" + this.month + "/" + this.year;
    }

    // So sanh bang
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyDate myDate = (MyDate) o;

        return day == myDate.day
                && month == myDate.month
                && year == myDate.year;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime*result+day;
        result = prime*result+month;
        result = prime*result+year;
        return result;
    }
}
