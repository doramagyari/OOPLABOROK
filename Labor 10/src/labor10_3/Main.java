package labor10_3;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try{
            FileUtil.encode("Labor 10/students.csv", "Labor 10/temp1.txt");
            FileUtil.decode("Labor 10/temp1.txt", "Labor 10/temp2.txt");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
