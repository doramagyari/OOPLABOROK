package labor9_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyDate> dateList = new ArrayList<>();
        int year = 2021;
        Random random = new Random();
        while(dateList.size()<10) {
            int month = random.nextInt(12);
            int day = random.nextInt(31);
            if(DateUtil.isValidDate(year, month, day)){

                dateList.add(new MyDate(year, month, day));
            }
        }
        for(MyDate d:dateList){
            System.out.println(d);
        }
        System.out.println();
        Collections.sort(dateList);
        for(MyDate d:dateList){
            System.out.println(d);
        }
        System.out.println();
//        MyDate date1=new MyDate(2020, 4, 25);
//        MyDate date2=new MyDate(2020, 4, 26);
//        System.out.println(date1.compareTo(date2));
    }
}

