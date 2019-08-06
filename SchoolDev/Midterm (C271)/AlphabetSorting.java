import java.util.*;

public class AlphabetSorting{
    public static void main (String [] args){
        LinkedList<String> llist1 = new LinkedList<String>();
        LinkedList<String> llist2 = new LinkedList<String>();
        LinkedList<String> llist3 = new LinkedList<String>();
        llist1.add("cat");
        llist1.add("dog");
        llist1.add("mouse");
        llist1.add("cow");

        llist2.add("cat");
        llist2.add("moose");
        llist2.add("jaguar");

        for (int i = 0; i < llist1.size(); i++){
            if (llist2.contains(llist1.get(i))){
                llist1.remove(i);
            }
            else{
                llist3.add(llist2.get(i));
                llist3.add(llist1.get(i));
            }
        }
        
        Collections.sort(llist3);
        System.out.println(llist3);
    }
}