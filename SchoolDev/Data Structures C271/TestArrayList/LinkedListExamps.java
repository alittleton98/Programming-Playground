import java.util.*;
/**
 * Write a description of class LinkedListExamps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinkedListExamps
{
    public static void main (String[]args){
        LinkedList<String> lList = new LinkedList<String>();
        
        lList.addFirst ("cat");
        lList.addFirst ("dog");
        lList.addFirst ("lion");
        lList.addFirst ("mouse");
        lList.add ("racoon");
        lList.add ("deer");
        
        System.out.println (lList.get(3));
    }
}
