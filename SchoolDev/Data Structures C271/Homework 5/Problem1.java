import java.util.ArrayList;

public class Problem1 {
    public static void main (String [] args){

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        for (int n = 0; n < 15; n++){
            numbers.add(n);
        } //Time Complexity O(n)
        
        System.out.println(numbers);
        System.out.println(numbers.size());

        for (int i = 0; i < (numbers.size())/2; i++){
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(numbers.size()-(i+1)));
            numbers.set(numbers.size()-(i+1), temp);
            System.out.println(numbers);
        } //Time complexity O(n/2)



    }
}