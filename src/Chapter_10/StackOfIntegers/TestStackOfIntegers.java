package Chapter_10.StackOfIntegers;

/**
 * Created by lmsj0 on 9/19/2017.
 */
public class TestStackOfIntegers {
    public static void main(String [] args){
        StackOfIntegers stack = new StackOfIntegers();
        for(int i = 0; i< 10; i++){
            stack.push(i);
        }
        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
