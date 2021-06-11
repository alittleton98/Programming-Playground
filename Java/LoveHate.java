import java.util.Scanner;
public class LoveHate{
    public static void main (String [] args){
        
        /*  Declare Scanner
            Ask user for input
            Declare variable for the user input sentence
            Declare variable for word to replace
            Use replace method to replace the word hate in the sentence
            Print new sentence
        */
        
        Scanner user = new Scanner(System.in);
        
        System.out.print ("Please tell me something you hate preceded by the the phrase \"I hate ...\" ");
        String sentence = user.nextLine();
        String love = "love";
        String replaced = sentence.replace("hate", love);
        
        
        System.out.println ("I believe you meant to say " + replaced);
    }
}