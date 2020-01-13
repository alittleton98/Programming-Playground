import java.util.ArrayList;

public class Problem2{
    public static void main (String [] args){

        ArrayList<String> firstList = new ArrayList<String>();
        
            firstList.add("wolverine");
            firstList.add("tarantula");
            firstList.add("dog");
            firstList.add("cat");
            firstList.add("fish");
        
        ArrayList<String> secondList = new ArrayList<String>();
        
            secondList.add("wolverine");
            secondList.add("tarantula");
            secondList.add("cat");
            secondList.add("racoon");
            secondList.add("possum");
            secondList.add("dog");
            secondList.add("guinea pig");
            secondList.add("gecko");
            secondList.add("iguana");
            secondList.add("fish");
           
        int count = 0;

        System.out.println(firstList);
        System.out.println(secondList);

        for (int i = 0; i < firstList.size(); i++){
            String word = firstList.get(i);
            if (secondList.contains(word)){
                count++;
            }
        } //Time complexity = O(n)

        System.out.println(count);
    }
}