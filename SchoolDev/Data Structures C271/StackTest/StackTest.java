import java.util.*;

public class StackTest{
    public static void main (String [] args){

        Stack<Integer> stack = new Stack<Integer>();
        
        stack.push(5);
        stack.push(10);
        stack.push(3);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}