import java.util.*;

public class Lab7{
    public static void main (String [] args){

        LinkedList<String> wordList = new LinkedList<String>();
        wordList.add("apple");
        wordList.add("strawberry");
        wordList.add("orange");
        wordList.add("pear");
        wordList.add("plum");
        wordList.add("banana");
        wordList.add("kiwi");
        wordList.add("grape");
        wordList.add("mango");

        ListIterator<String> li = wordList.listIterator();

        //Head to tail
        while (li.hasNext()){
            System.out.println(li.next());
        }
        System.out.println();

        // Tail to head

        li = wordList.listIterator(wordList.size());

        while (li.hasPrevious()){
            System.out.println(li.previous());
        }
        System.out.println();

        //Get method forward

        for (int i = 0; i < wordList.size(); i++){
            System.out.println(wordList.get(i));
        }
        System.out.println();

        //Get method backward 

        for (int i = wordList.size()-1; i >= 0; i--){
            System.out.println(wordList.get(i));
        }
        System.out.println();

        //4. The get method is easier for running through the list backwards because the listIterator isn't manipulated but the list can be run through indepently. The iterator is better for running through forward though.

        //5. It should print "perfect" because it will go ( |  represents cursor) [f t |], [| f t], [e r |f t], [e r f| t] [e r f e c t]. [| e r f e c t ] [p e r f e c t]
        
    }
}