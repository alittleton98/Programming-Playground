import java.util.*;
public class DoubleQueue<E> extends LinkedList<E> {
    
    public void enqueHead (E element){
        this.addFirst(element);
    }

    public void enqueTail (E element){
        this.addLast(element);
    }

    public E dequeHead(E element){
        return this.removeFirst();
    }

    public E dequeTail (E element){
        return this.removeLast();
    }

    public E peekHead (){
        return this.peek();
    }

    public E peekTail(){
        return this.peekLast();
    }
    
}