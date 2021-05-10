package labor9_2;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Ceg1");
        company.hireAll("Labor 9/employees.csv");
        company.printAll(System.out);

        System.out.println();
        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getFirstName().equals(o2.getFirstName())) {
                    return o1.getLastName().compareTo(o2.getLastName());
                }
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        company.printAll(System.out);
    }
}
