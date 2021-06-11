import java.util.*;

public class lab4{
    public static void main (String [] args){
        Scanner user = new Scanner(System.in);

        int largest = 0;
        int smallest = 1000;
        int enteredNum=0;
        int count = 1;
        int sum = 0;
        double avg;

        

        do{
            System.out.print ("Enter a positive number: ");
            enteredNum = user.nextInt();
            if (enteredNum > largest){
                largest = enteredNum;
            }
            if (enteredNum < smallest && enteredNum > 0){
                smallest = enteredNum;
            }
            sum += enteredNum;
            count++;
        }while (enteredNum > 0);

        avg = sum/count;

        System.out.println ("Largest: " + largest);
        System.out.println ("Smallest: " + smallest);
        System.out.println ("Average: " + avg);
    }
}