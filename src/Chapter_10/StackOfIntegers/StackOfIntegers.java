package Chapter_10.StackOfIntegers;

/**
 * Created by lmsj0 on 9/19/2017.
 */
public class StackOfIntegers {
    private int [] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers(){
        this(DEFAULT_CAPACITY);
    }
    public StackOfIntegers(int capacity){
        elements = new int[capacity];
    }

    public void push(int value){
        if(size >= elements.length){
            int [] temp = new int [elements.length*2];
            System.arraycopy(elements,0,temp,0,elements.length);
            /**
             * src − This is the source array.

             srcPos − This is the starting position in the source array.

             dest − This is the destination array.

             destPos − This is the starting position in the destination data.

             length − This is the number of array elements to be copied.
             */
            elements = temp;
        }

        elements [size++] = value;
    }

    public int pop(){
        return elements[--size];
    }

    public int peek(){
        return elements[size - 1];

    }

    public boolean empty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }
}
