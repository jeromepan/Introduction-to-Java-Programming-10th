package chpter12.exercise12_5;


public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    Triangle(){
        double side1 = 0.0;
        double side2 = 0.0;
        double side3 = 0.0;
    }

    Triangle(double side1, double side2, double side3)throws IllegalTraiangleException{
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        try{
            if((side1 + side2) < side3 || (side2 + side3 ) < side1 || (side3 + side1) <side2)
                throw new IllegalTraiangleException();

        }catch (IllegalTraiangleException ex){
            System.out.println(ex);
        }
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){
        double s =( side1 + side2 + side3)/2;
        double area = s*(s - side1)*(s - side2)*(s - side3);
        return area;
    }

    public double getPerimeter(){
        return (side1 + side2 + side3);
    }

    public String toString(){
        return "Triangle: side1= " + side1 + " side2=" + side2 + " side3=" + side3;
    }

}


