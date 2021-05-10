package labor10_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("Labor 10/students.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        PrintStream writer= null;
        try {
            writer = new PrintStream("warnings.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(2);
        }
        while (scanner.hasNextLine()) {
            String fullLine = scanner.nextLine();
            String items[] = fullLine.split(",");
            if (items.length < 7) {
                System.out.println("Incomplete line: " + fullLine);
                continue;
            }
//            NeptunId, firstname, lastname, credits, birthyear, birthmonth, birthday
            int credits = 0;
            try {
                credits = Integer.parseInt(items[3].trim());
            } catch (NumberFormatException e) {
                System.out.println("Number format exception: " + fullLine + " CREDITS: "+ items[3]);
                continue;
            }
            int year, month, day;
            try {
                year = Integer.parseInt(items[4].trim());
            }catch(NumberFormatException e) {
                System.out.println("Number format exception: " + fullLine + " YEAR: " + items[4]);
                continue;
            }
            try {
                month = Integer.parseInt(items[5].trim());
            }catch(NumberFormatException e) {
                System.out.println("Number format exception: " + fullLine + " MONTH: " + items[5]);
                continue;
            }
            try {
                day = Integer.parseInt(items[6].trim());
            }catch(NumberFormatException e) {
                System.out.println("Number format exception: " + fullLine + " DAY: " + items[6]);
                continue;
            }
            if(!DateUtil.isValidDate(year,month, day)){
                System.out.println("Invalid date: " +fullLine); continue;
            }
            if(credits < 30){
               writer.println(fullLine);
            }
        }
    }
}
