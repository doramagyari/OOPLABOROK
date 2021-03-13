package labor2_2;

public class Rectangle {
    private double length, width;
    public Rectangle(double length, double width) {
        System.out.println("constructor rectangle");
        if(length <0 || width < 0){
            return;
        }
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
}
