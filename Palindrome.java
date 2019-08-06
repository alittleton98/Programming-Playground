import java.util.Scanner;
public class Palindrome {
    /*
    Create the scanner that will be used to gather user input
    declare all variables used to find out the program:
        -the String for the user input sentence
        -the array of characters that will be include the sentence with spaces
        -the array of characters that will be the sentence without spaces
        -the character that defines a "space"
        -the int that will define the length of the arrays
        -the ints that will of be used to traverse the array
        - the boolean that will check if the conditional for the sentence being a  palindrome is true
    Ask the user for a sentence
    Put the sentence into the aforementioned String
    Trim the sentences of leading and trailing white space
    Sent the length of the arrays to the lenght of the sentence
    set the String the a character array
    traverse the first array to check for spaces
        check spaces and put any character that isn't a space into the next array
    Check the new array to see if the character at the corresponding element is the same
        traverse array 
        check each element to it's corresponding element
        if true: return check boolean as true
        if false: return check boolean as false
    Print result based on check boolean
        if true: say it's a palindrome
        if false: say it isn't a palindrome
    */
    public static void main (String [] args){
        Scanner user = new Scanner(System.in);
        String sent;
        int i;
        int k;
        char spaces[];
        char noSpaces[];
        char space = ' ';
        int length;
        boolean check = true;
        
        
        System.out.println ("I'm going to check and see if the sentence you enter is a palindrome!");
        System.out.print ("Please enter a sentence: ");
        sent = user.nextLine();
        sent = sent.trim();
        length = sent.length();
        spaces = new char[length];
        noSpaces = new char[length];
        spaces = sent.toCharArray();
        
        for (i = 0; i < spaces.length; i++){
            if (spaces[i] != space){
                noSpaces[i] = spaces[i];
            }
        }
        
        for (k = 0; k < noSpaces.length/2; k++){
            if (noSpaces[k] == noSpaces [noSpaces.length - k - 1]){
            check = true;
            }
            else{
            check = false;
            }
        }
        if (check == true){
            System.out.println ("Your sentence is a palindrome!");
        }
        else{
           System.out.println ("Your sentence is not a palindome. Sorry :( "); 
        }

        user.close();
    }
}