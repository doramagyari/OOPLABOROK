package labor2_2;

public class Main {
    public static void main(String[] args){
//        Rectangle rectangle1 = new Rectangle(2,3);
//        System.out.println(rectangle1.getLength() +", "+rectangle1.getWidth());

//        Rectangle rectangle2 = new Rectangle(-7, -3);
//        System.out.println(rectangle2.getLength() +", "+rectangle2.getWidth());

        Rectangle [] rectangles = new Rectangle[ 10 ];
        rectangles[ 0] = new Rectangle(2, 1);

        for( Rectangle rect: rectangles){
            if(rect != null){
                System.out.println(rect.getLength() +"," +rect.getWidth());
            }
            else{
                System.out.println(rect);
            }
        }
    }
}
