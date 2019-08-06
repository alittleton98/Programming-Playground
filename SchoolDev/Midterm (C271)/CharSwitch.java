import java.util.*;

public class CharSwitch{
    public static void main (String [] args){
        String word;
        int place;
        char replacement;
        Scanner user = new Scanner (System.in);

        System.out.print ("Please enter a word: ");
        word = user.nextLine();
        System.out.print ("Enter a number between 1 and the number of characters in the word you entered: ");
        place = user.nextInt();
        System.out.print ("Enter a single letter: ");
        replacement  = user.next().charAt(0);
        user.close();

        System.out.println ("Your word with the letter replaced is: " + replaceChar(word, place, replacement));
    }

    public static String replaceChar (String p, int k, char c){
        String newWord;
        char[] c_Arr = p.toCharArray(); 
        c_Arr[k - 1] = c;
        newWord  = new String (c_Arr);
        return newWord;
    }
}