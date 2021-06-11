import java.util.Scanner;
public class MadLib{
    public static void main (String [] args){
        
        /*
            Declare Scanner
            Create variables for all user information
            Ask user for information 
            Apply user input to each variable
            Print story
        */
        
        
        Scanner user = new Scanner(System.in);
        
        String favFood;
        String favAnim;
        String person;
        String favColor;
        
        System.out.print ("Hello. Please enter your favorite food: ");
        favFood = user.nextLine();
        System.out.print ("Now enter your favorite animal: ");
        favAnim = user.nextLine();
        System.out.print ("and favorite color: ");
        favColor = user.nextLine();
        System.out.print ("Lastly, please enter the name of a friend or relative: ");
        person = user.nextLine();
        
        System.out.println ("I wrote a story with the information you gave me! I had a dream that " + person + " ate a " + favColor + " " + favAnim + " and said it tasted like " + favFood);
    }
}