package Chapter_9;

/**
 * Created by lmsj0 on 9/10/2017.
 */
public class Simpl_Circle {
    public static void main(String [] args){
        Simpl_Circle circle1 = new Simpl_Circle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        Simpl_Circle circle2 = new Simpl_Circle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        Simpl_Circle circle3 = new Simpl_Circle(125);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

    }

    double radius;

    Simpl_Circle(){
        radius = 1;
    }

    Simpl_Circle(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return  radius * radius * Math.PI;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }
}
