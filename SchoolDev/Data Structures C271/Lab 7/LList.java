import java.util.*;

//import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class LList{
    public static void main (String [] args){
        LinkedList<Character> letters = new LinkedList<Character>();
ListIterator<Character> itr = letters.listIterator();
itr.add('f');
itr.add('t');
itr.previous();
itr.previous();
itr.add('e');
itr.add('r');
itr.next();
itr.add('e');
itr.add('c');
itr=letters.listIterator();
itr.add('p');
System.out.println(letters);

    }
}