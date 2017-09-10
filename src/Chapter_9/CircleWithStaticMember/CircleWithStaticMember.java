package Chapter_9.CircleWithStaticMember;

/**
 * Created by lmsj0 on 9/10/2017.
 */
public class CircleWithStaticMember {
    double radius;
    static int numberOfObjects = 0;

    CircleWithStaticMember(){
        radius = 1;
        numberOfObjects++;
    }

    CircleWithStaticMember(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }
    double getArea(){
        return radius * radius *Math.PI;
    }
}
