package labor10_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String[] tokens = data.split(" ");
        double sum = 0;
        for (String a : tokens) {
            try {
                sum += Double.parseDouble(a);
            } catch (NumberFormatException e) {
                System.out.println("An error occured:" + a);
            }
        }
        System.out.println("Sum: " + sum);
    }
}