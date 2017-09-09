package Chapter_9.Programming_Exercise9_1;

/**
 * Created by lmsj0 on 9/10/2017.
 */
public class TestRectangle {
    public static void main(String [] args){
        Rectangle rect = new Rectangle();

        System.out.println("The area of rectangle with width " + rect.width + " and height " + rect.height + " is " + rect.getArea());
        System.out.println("The area of rectangle with width " + rect.width + " and height " + rect.height + " is " + rect.getPerimeter());

        Rectangle rect1 = new Rectangle(4,40);
        System.out.println("The area of rectangle with width " + rect1.width + " and height " + rect1.height + " is " + rect1.getArea());
        System.out.println("The area of rectangle with width " + rect1.width + " and height " + rect1.height + " is " + rect1.getPerimeter());

        Rectangle rect2 = new Rectangle(3.5,35.9);
        System.out.println("The area of rectangle with width " + rect2.width + " and height " + rect2.height + " is " + rect2.getArea());
        System.out.println("The area of rectangle with width " + rect2.width + " and height " + rect2.height + " is " + rect2.getPerimeter());

    }



}
