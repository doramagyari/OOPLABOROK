package labor11_1;

public class Main {
    public static void main(String[] args) {
        String sa_array[]=new String[ 10 ];
        for(int i =0; i<10; ++i){
            sa_array[ i]= " ";
        }
        Thread producer = new AddToArray(sa_array);
        Thread consumer = new TakeSomeFromArray(sa_array, "ppp", 3);
        producer.start();
        consumer.start();
    }
}
