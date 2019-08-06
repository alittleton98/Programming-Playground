import java.util.*;

public class PrefixSums {
    public static void main (String [] args){

        LinkedList<Integer> link = new LinkedList<Integer>();
        link.add(1);
        link.add(7);
        link.add(9);
        link.add(6);
        link.add(3);
        link.add(2);
        link.add(4);
        link.add(7);
        link.add(9);
        link.add(3);

        ListIterator<Integer> li = link.listIterator();

        int sumFor = 0;
        System.out.println("Forward iteration sum: ");
        while (li.hasNext()){
            int numFor = li.next();
            sumFor += numFor;
            System.out.print(sumFor + ", ");
        }
        System.out.println();
        System.out.println("Backward iteration sum: ");
        int sumBack = 0;
        while (li.hasPrevious()){
            int numBack = li.previous();
            sumBack += numBack;
            System.out.print(sumBack + ", ");
        }
        System.out.println();
    }
}
