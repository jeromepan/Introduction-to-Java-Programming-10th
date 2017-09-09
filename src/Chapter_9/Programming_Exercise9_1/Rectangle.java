package Chapter_9.Programming_Exercise9_1;

/**
 * Created by lmsj0 on 9/10/2017.
 */
public class Rectangle {
    double width ;
    double height ;

    Rectangle(){
        width = 1;
        height = 1;
    }
    Rectangle(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }

    double getArea(){
        return width * height;
    }

    double getPerimeter(){
        return 2 * (width + height);
    }

    void setWidth(double newWidth){
        width = newWidth;
    }

    void setHeight(double newHeith){
        height = newHeith;
    }
}
