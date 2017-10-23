package chpter12.exercise12_5;

public class IllegalTraiangleException extends Exception{
    public IllegalTraiangleException(){
        System.out.println("sum of two sides is greater than " + "the other side");
    }
}
