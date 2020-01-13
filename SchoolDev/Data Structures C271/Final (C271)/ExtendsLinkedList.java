import java.util.*;

public class ExtendsLinkedList<E> extends LinkedList {
    int count;
    static ExtendsLinkedList<Integer> intList = new ExtendsLinkedList<Integer>();

    public int countOccurences(E element){
        if (this.length > 0){
            for (int i = 0; i < this.size(); i++){
                if (this.get(i) == element){
                    count++;
                }
                else{
                    return -1;
                }
            }
        }
        else{
            System.out.println("Structure is empty");
        }

        return count;
        count = 0;
    }

    public boolean pairPresence (E element1, E element2){
        if (this.length > 1){
            for (int i = 0; i < this.size(); i++){
                if (this.get(i).equals(element1) && this.get(i+1).equals(element2)){
                    System.out.println(element1 + " " + element2);
                    
                    return true;
                }
            }
        }
        else{
            System.out.println("Structure is empty or too small to perform function");
            return false;
        }
    }

    public static void main (String [] args){

        intList.add(1);
        intList.add(4);
        intList.add(6);
        intList.add(1);
        intList.add(3);
        intList.add(1);
        intList.add(1);
        intList.add(7);
        intList.add(15);
        intList.add(9);
        intList.add(12);
        intList.add(28);

        intList.countOccurences(1);
        intList.pairPresence(4,6);
    }
}