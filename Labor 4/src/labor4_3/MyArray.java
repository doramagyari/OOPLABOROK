package labor4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    private int length;
    private double[] elements;

    public MyArray(int length) {
        this.length = length;
        this.elements = new double[length];
    }
    public MyArray(MyArray array) {
        this.length = array.length;
        this.elements= new double[this.length];
        for(int i = 0; i<this.length; i++){
            this.elements[i]=array.elements[i];
        }
    }
    public MyArray(double[] array){
        this.length = array.length;
        this.elements = new double[this.length];
        for(int i=0; i< array.length; i++){
            this.elements[i]=array[i];
        }
    }
    public MyArray(String file){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        String line = scanner.nextLine();
        this.length = Integer.parseInt(line);
        this.elements = new double[this.length];
        line = scanner.nextLine();
        String[] elements = line.split(" ");
        for(int i = 0; i < this.length; i++){
            this.elements[i] = Integer.parseInt(elements[i]);
        }

    }
    public void fillRandom(double num1, double num2){
        Random rand1=new Random();
        for(int i=0; i<this.length; i++){
            this.elements[i] = rand1.nextDouble()*(num2-num1)+num1;
        }
    }
    public double mean(){
        double s=0;
        for(int i=0; i<this.length; i++){
            s+=elements[i];
        }
        return s/this.length;
    }
    public double stddev(){
        double T = mean();
        double[] M = this.elements;
        double S = 0;
        for(int i = 0; i < this.length; i++){
            M[i] -= T;
            M[i] *= M[i];
            S += M[i];
        }
        double Dev = Math.sqrt(S / this.length);
        return Dev;
    }
    public void sort(){
        Arrays.sort(this.elements);
    }
    public void print(String string){
        System.out.printf(string  + ":");
        for(double element:this.elements){
            System.out.printf("%10.2f ", element);
        }
        System.out.println();
    }
}

