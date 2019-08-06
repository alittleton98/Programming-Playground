import java.util.*;

public class DoublePalindrome {
    
    public static void checkDouble(String s){
        String[] checkArr = s.split("");
        Stack<String> wordStack = new Stack<String>();
        System.out.println(Arrays.toString(checkArr));
        for (int i = 0; i < (checkArr.length/2); i++){
            wordStack.push(checkArr[i]);
            System.out.println(wordStack.peek());
        }
        for (int j = (checkArr.length/2)-1; j > checkArr.length; j++){
            
            if (checkArr[j].equals(wordStack.peek())){
                wordStack.pop();
                
            }
            
        }

        if (wordStack.empty()){
            System.out.println("You entered a double palindrome!");
        }
        else{
            System.out.println("Whack");
            System.out.println(wordStack.peek());
        }
    }

    public static void main (String [] args){
        String word = "mommom";
        checkDouble(word);
    }
}