import java.util.Scanner;
import java.util.ArrayList;

public class JavaTest{
    public static void main (String [] args){
        
        Scanner user = new Scanner(System.in);
        int GoodChoice = 1;
        int BadChoice = 2;
        
        System.out.println ("Pick a number: 1 or 2");
        int u = user.nextInt();
        
        if (u == 1){
            System.out.println ("You have good taste in numbers. Good Job");
        }
        else{
            System.out.println ("You should rethink your decision");
        }
        
    }
}