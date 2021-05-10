package labor12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bac {
    private Map<Integer, Student> students = new HashMap<>();

    public Bac(String filename) {
        try(Scanner scanner = new Scanner(new File(filename))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String items[] = line.split(" ");
                int id = Integer.parseInt(items[0]);
                Student student = new Student(id, items[1].trim(), items[2].trim() );
                students.put(id, student);
            }
            System.out.println(students.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
