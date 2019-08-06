import java.util.ArrayList;

public class Problem3{
    public static void main (String [] args){
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(13);
        numbers.add(21);
        numbers.add(21);
        
        int count = 0;

        for (int i = 0; i < numbers.size()-1; i++){
            if (numbers.get(i) == numbers.get(i+1)){
                count++;
            }
        } // Time complexity = O(n)

        System.out.println(count);
    }
}