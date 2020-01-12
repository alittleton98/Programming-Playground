import java.util.*;

public class ExtLinkedList<E> extends LinkedList<E> {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ArrayList<E> cloneLinkedList() {

        ArrayList<E> al = new ArrayList<E>();
        ListIterator<E> li = this.listIterator();
        while (li.hasNext()) {
            al.add(li.next());
        }
        int half = al.size() / 2;

        for (int i = al.size() - 1; i > half - 1; i--) {
            al.remove(i);
        }

        return al;
    }

    public ArrayList<E> oddList() {
        ArrayList<E> al = new ArrayList<E>();
        ArrayList<E> returned = new ArrayList<E>();
        ListIterator<E> li = this.listIterator();

        while (li.hasNext()) {
            al.add(li.next());
        }
        for (int k = 1; k < al.size(); k += 2) {
            returned.add(al.get(k));
        }

        return returned;
    }

    public ArrayList<E> evenList() {
        ArrayList<E> al = new ArrayList<E>();
        ArrayList<E> returned = new ArrayList<E>();
        ListIterator<E> li = this.listIterator();

        while (li.hasNext()) {
            al.add(li.next());
        }
        for (int k = 0; k < al.size(); k += 2) {
            returned.add(al.get(k));
        }

        return returned;
    }

    public static void main(String[] args) {

        ExtLinkedList<Integer> eli = new ExtLinkedList<Integer>();
        eli.add(5);
        eli.add(8);
        eli.add(20);
        eli.add(1);
        eli.add(100);
        eli.add(100);
        ArrayList<Integer> al = eli.cloneLinkedList();
        System.out.println(al);

        ExtLinkedList<Integer> eli2 = new ExtLinkedList<Integer>();
        eli2.add(5);
        eli2.add(8);
        eli2.add(20);
        eli2.add(1);
        eli2.add(100);
        eli2.add(100);
        ArrayList<Integer> al2 = eli2.oddList();
        System.out.println(al2);

        ExtLinkedList<Integer> eli3 = new ExtLinkedList<Integer>();
        eli3.add(5);
        eli3.add(8);
        eli3.add(20);
        eli3.add(1);
        eli3.add(100);
        eli3.add(100);
        ArrayList<Integer> al3 = eli3.evenList();
        System.out.println(al3);

    }

}