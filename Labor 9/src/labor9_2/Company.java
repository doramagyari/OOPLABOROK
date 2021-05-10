package labor9_2;

import labor9_1.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void hireAll(String csvFilename) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(csvFilename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found: " + csvFilename);
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                continue;
            }
            String items[] = line.split(",");
            String firstName = items[0].trim();
            String lastName = items[1].trim();
            double salary = Double.parseDouble(items[2].trim());
            int year = Integer.parseInt(items[3].trim());
            int month = Integer.parseInt(items[4].trim());
            int day = Integer.parseInt(items[5].trim());

            if(items.length == 6) {
                this.employees.add(new Employee(firstName, lastName, salary, new MyDate(year, month, day)));
            }
            else {
                this.employees.add(new Manager(firstName, lastName, salary,new MyDate(year, month, day), items[6].trim()));
            }
        }
        scanner.close();
    }
    public void printAll(PrintStream ps){
        for(Employee e:employees){
            System.out.println(e);
        }
    }

    public void sortByComparator(Comparator<Employee> comparator){

        Collections.sort(employees, comparator);
    }
}
