import java.util.*;
public class AList
{
    public static void main (String [] args){
        
        ArrayList<String> al = new ArrayList<String>();
            al.add("banana");
            al.add("apple");
            al.add("pear");
            al.add("strawberry");
            
            //Can't index arrays. Must use get method
            
            System.out.println (al);
            
            for (int i = 0; i < al.size(); i++){
                System.out.println (al.get(i) + "\n");
            }
            
            for (String s:al)
            System.out.println (s + "\n");
            
            
            ListIterator<String> li = al.listIterator();
            while (li.hasNext()){
               System.out.println(li.next()); 
            }
            
            Collections.sort(al);
            //use Arrays.sort(al) if array needs to be sorted
            System.out.println();
            
            System.out.println(al);
            
        }
}
