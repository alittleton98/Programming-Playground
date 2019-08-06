import java.util.HashSet;

public class HashExample{
    public static void main (String [] args){

        HashSet<String> hs = new HashSet<String>();
        hs.add("cat");
        hs.add("dog");
        hs.add("waffles");
        hs.add("bugs");
        hs.add("pancakes");

        System.out.println(hs.contains("cat"));
    }
}