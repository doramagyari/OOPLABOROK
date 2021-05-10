package labor11_1;

public class TakeSomeFromArray extends Thread {
    private String[] array;
    private String string;
    private int number;

    public TakeSomeFromArray(String[] array, String string, int number) {
        this.array = array;
        this.string = string;
        this.number = number;
    }

    @Override
    public void run() {
        while(number>0){
            synchronized (this.array){
                for(int i =0; i<array.length; i++){
                    if(array[i].compareTo(string)==0){
                        array[i] = " ";
                        number--;
                        System.out.println(string + "removed" +(10-number) + "Times");
                    }
                }
            }
        }
    }
}


