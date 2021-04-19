package labor8_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary {
    private ArrayList<String> words = new ArrayList<String>();

    public ArrayListDictionary() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(DICTIONARY_FILE));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not foud : " + DICTIONARY_FILE);
            System.exit(1);
        }
        while(scanner.hasNextLine()){
            String row = scanner.nextLine();
            words.add(row);
        }
    }

    @Override
    public boolean add(String word) {
        return false;
    }

    @Override
    public boolean find(String word) {
        return Collections.binarySearch(words, word) >= 0;
    }

    @Override
    public int size() {
        return words.size();
    }

    public static void main(String[] args) {
        IDictionary dictionary = new ArrayListDictionary();
        System.out.println(dictionary.size());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Word to find ( Enter <end> for exit): ");
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("end")) {
                break;
            }
            System.out.println(" Find(" + word + "): " + dictionary.find(word));


        }
    }
}