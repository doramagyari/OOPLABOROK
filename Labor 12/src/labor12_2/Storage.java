package labor12_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Storage {
    private Map<Integer, Product> products = new HashMap<>();

    public Storage(String fileName) {
        try( Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String temp[] = scanner.nextLine().split(" ");
                int ID = Integer.parseInt(temp[0].trim());
                Product newProduct = new Product(ID, temp[1], Integer.parseInt(temp[2].trim()), Integer.parseInt(temp[3].trim()));
                products.put(ID, newProduct);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found: " + fileName);
            System.exit(1);
        }
        System.out.println("Size: " + this.products.size());
    }


    public void update(String fileName) {
        Scanner scanner = null;
        int updatedProducts = 0;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found: " + fileName);
            System.exit(1);
        }
        while (scanner.hasNextLine()) {
            String line[] = scanner.nextLine().split(" ");
            int idToSearch = Integer.parseInt(line[0].trim());
            Product product = products.get(idToSearch);
            if (product != null) {
                products.get(idToSearch).increaseAmount(Integer.parseInt(line[1].trim()));
                updatedProducts++;
                //itt ki lehet iratni a frissitett adatokat, de az ido hatekonysag miatt kivettem
//                System.out.println(line[0] + " product is succesfully updated! New amount: " + products.get(indexFound).getAmount());
            } else {
                //hasonloan az elozo if-hez, itt is kiirathato ha nem talahato a termek
//                System.out.println("This product can not be found: " + line[0]);
            }
        }
        System.out.printf("%d products were updated!", updatedProducts);
    }
}
