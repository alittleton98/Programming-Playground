//FIX REPEATS
import java.util.*;

public class ArrayDifference{

    public static void main (String [] args){
        Scanner user = new Scanner (System.in);
        int[] num_arr = new int[10];
        ArrayList<Integer> pair_arr = new ArrayList<Integer>();
        int diffFactor;

        System.out.print ("Enter a single digit intger for the difference factor: ");
        diffFactor = user.nextInt();

        for (int h = 0; h < num_arr.length; h++){
            System.out.print ("Enter any integer: ");
            num_arr[h] = user.nextInt();
        }

        for (int i = 0; i < num_arr.length; i++){
            int testNum = num_arr[i];
            for (int j = 0; j < num_arr.length; j++){
                if (testNum - num_arr[j] == diffFactor || testNum - num_arr[j] == -diffFactor){
                    pair_arr.add(testNum);
                    pair_arr.add(num_arr[j]);
                }
            }
        }

        for (int k = 0; k < pair_arr.size()-1; k+=2){
            System.out.println("(" + pair_arr.get(k) + "," + pair_arr.get(k + 1) + ")");
        }
    user.close();
    }
}