import java.util.*;

public class DifferByVariable{

    static HashSet<Integer> hashset = new HashSet<Integer>();

    public static void differByK (int[] arr, int k){
        for (int i = 0; i < arr.length; i++){
            hashset.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            if (hashset.contains(arr[i] + k)){
            
                System.out.println ("(" + arr[i] + "," + (arr[i] + k) + ")" );
            }
            if (hashset.contains(arr[i] - k)){
                
                System.out.println ("(" + arr[i] + "," + (arr[i] - k) + ")" );
            }
        }

        
    }

    public static void main (String [] args){
        int[] arr = {1,3,4,5,7,9,4,8,5,9};
        int k = 3;

        differByK (arr, k);
    }
}