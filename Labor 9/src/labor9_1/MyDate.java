package labor9_1;

public class MyDate implements Comparable<MyDate> {
    private int year, month, day;

    public MyDate(int year, int month, int day){
        if(year < 1 || (month < 1 || month >12) || (day<1 || day > 31)){
            return;
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return  "year=" + year +
                " month=" + month +
                " day=" + day ;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


    @Override
    public int compareTo(MyDate myDate) {
        if( this.year != myDate.year ){
            return this.year - myDate.year;
        }
        if( this.month != myDate.month){
            return this.month - myDate.month;
        }
        if( this.day != myDate.day ){
            return this.day - myDate.day;
        }
        return 0;
    }
}


