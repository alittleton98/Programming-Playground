import java.util.*;

public class CommonElement{

    public static void commonCheck(int[] arr1, int [] arr2){

        HashSet<Integer> hash = new HashSet<Integer>();
        
        for (int i = 0; i < arr1.length; i++){
            hash.add(arr1[i]);
        }
        
        if (arr1.length > arr2.length){
            for (int i = 0; i < arr2.length; i++){
                hash.add(arr2[i]);
            }
            for (int i = 0; i < arr1.length; i++){
                if (hash.contains(arr1[i])){
                    System.out.println (arr1[i]);
                }
            }
        }
        else{
            for (int i = 0; i < arr1.length; i++){
                hash.add(arr1[i]);
            }
            for (int i = 0; i < arr2.length; i++){
                if (hash.contains(arr2[i])){
                    System.out.println (arr2[i]);
                }
            } 
        }
    }

    public static void main (String [] args){

        int[] arr1 = {1,3,6,4,7,2,89,4,5,7,4,3,6,3};
        int[] arr2 = {5,34,5,7,8,3,3,3,5,8,3,2,5,8,5};

        System.out.println("The arrays have these elements in common: ");
        commonCheck(arr1, arr2);
    }
}