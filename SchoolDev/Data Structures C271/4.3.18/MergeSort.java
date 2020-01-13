
import java.util.*;
public class MergeSort
{
    int size =1000000;
    int [] sortingArray;
    
    public MergeSort () {
        
        Random r = new Random();
        int s=size*2;
        
        sortingArray = new int[size];
        for (int i=0;i<size;i++)
          sortingArray[i]= r.nextInt(s);
    }
public int[] merge(int arr1[], int arr2[]){
    
    int n1=arr1.length;
    int n2=arr2.length;

    int[] mergedArray = new int[n1+n2];;
  int i = 0, j = 0, index = 0;
 
  while (i < n1 && j < n2){
   if (arr1[i] < arr2[j])       
    mergedArray[index++] = arr1[i++];
   else       
    mergedArray[index++] = arr2[j++];               
  }
 
  while (i < n1)  
   mergedArray[index++] = arr1[i++];
 
  while (j < n2)    
   mergedArray[index++] = arr2[j++];
 
  return mergedArray;
}

public int[] mergeSort (int [] arr) {
    
    
    
    int len=arr.length;
    /*
    if (len<=2) {
    
     Arrays.sort(arr);
     return arr;
    }*/
    
    if (len==1)return arr;
     
    else {
           int[] arr1 = Arrays.copyOfRange(arr,0,len/2);
           int[] arr2 = Arrays.copyOfRange(arr,len/2,len);
          // arr1=mergeSort(arr1);
           //arr2=mergeSort(arr2);
          // return merge(arr1,arr2);
           // OR
           return merge(mergeSort(arr1),mergeSort(arr2));
        }
        
    
    
}

public static void main(String[] args) {
    
    MergeSort ms = new MergeSort();
    
    int k=32;
    int size =(int)Math.pow(k,5);
    Random r = new Random();
    int [] ar= new int[size]; 
    
   // int[] ar= {1,4,5,9,2,18,3,7,5,9,2, 7, 8, 12,25,0};
     for (int i=0;i<size;i++)
        ar[i]=r.nextInt(3*size);
       
    long t1=System.currentTimeMillis();
   ar = ms.mergeSort(ar);
    long t2=System.currentTimeMillis();
    System.out.println(t2-t1);
    
}
}