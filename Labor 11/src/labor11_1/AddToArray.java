package labor11_1;

import java.util.Random;

public class AddToArray extends Thread {
    String[] array;

    public AddToArray(String[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        Random random=new Random();
        while(true){
            int number = random.nextInt(26);
            char character = (char)(number + 97);
            String string = "" + character + character + character;
//            System.out.println(string);
            synchronized (this.array) {
                array[minindex()] = string;
                print();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int minindex(){
        int minIndex = 0;
        String minValue = array[0];
        for(int i=1; i< array.length; i++){
           if (array[i].compareTo(minValue)< 0){
                minIndex = i;
                minValue=array[i];
            }
        }
        return minIndex;
    }

    private void print(){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
