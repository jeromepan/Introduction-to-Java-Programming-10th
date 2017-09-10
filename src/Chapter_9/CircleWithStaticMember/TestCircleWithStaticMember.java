package Chapter_9.CircleWithStaticMember;

/**
 * Created by lmsj0 on 9/10/2017.
 */
public class TestCircleWithStaticMember {
    public static void main(String [] args){
        System.out.println("Before creating objects: ");
        System.out.println("The number of Circle objects is " + CircleWithStaticMember.numberOfObjects);

        CircleWithStaticMember c1 = new CircleWithStaticMember();

        System.out.println("\nAfter creating c1 ");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");


        CircleWithStaticMember c2 = new CircleWithStaticMember();
        c1.radius = 9;


        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
        System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");
    }
}
