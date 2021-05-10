package labor12_2;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Storage storage1 = new Storage("Labor 12/data1000000.txt");

//        storage1.update("update10.txt");
        long endTime = System.nanoTime();

        //kulonbseg
        long elapsed = endTime - startTime;
        System.out.println("\nExecution time in milliseconds: " + elapsed/1000000);
    }
}
