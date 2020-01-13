import java.util.*;
public class ArrayListStack<E> extends ArrayList<E>{

    public void push(E){
        this.add(E);
    }

    public E pop(){
        return remove(this.size()-1);
    }

    public E peek(){
        return get(this.size()-1);
    }

    public boolean empty(){
        return isEmpty();
    }

    public static void main (String [] args){
        ArrayListStack<Integer> als = new ArrayListStack<Integer>();
        als.push(5);
        als.push(7);
        als.push(8);
        als.push(90);

    }
}