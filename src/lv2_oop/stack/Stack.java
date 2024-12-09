package lv2_oop.stack;

public class Stack<T> {

    private T[] values;

    private int counter;

    public Stack (T[] values){
        this.values = values;
        this.counter = 0;
    }

    public void push(T value){
        this.values[counter] = value;
        this.counter++;
    }

    public T pull(){  //hin und wieder auch pop
        this.counter--;
        return this.values[counter];
    }
}
