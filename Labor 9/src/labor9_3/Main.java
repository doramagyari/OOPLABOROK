package labor9_3;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Storage storage1 = new Storage("Raktar1", "Labor 9/data100.txt");

//        storage1.update("update10.txt");
        long endTime = System.nanoTime();

        //kulonbseg
        long elapsed = endTime - startTime;
        System.out.println("\nExecution time in seconds: " + elapsed/1000000);
    }
}
