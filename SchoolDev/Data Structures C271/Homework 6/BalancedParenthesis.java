import java.util.*;

public class BalancedParenthesis {
    public static void checkBalance(String s){
        Stack<String> stringStack = new Stack<String>();
        
        String[] chars = s.split("");
        for (int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }

        for (int i = 0; i < chars.length; i++){
            if (chars[i].equals("(")){
                stringStack.push(chars[i]);
                System.out.println("left");
            }
            for (int j = 0; j < chars.length-1; j++){
                if (chars[i].equals(")")){
                    stringStack.pop();
                    System.out.println("right");
                }
            }
        }
        
        if (stringStack.empty()){
            System.out.println("Your parenthesis are balanced");
        }
        else{
            System.out.println("Your parenthesis are not balanced. Whack.");
        }

    }

    public static void main (String [] args){
        Scanner user = new Scanner (System.in);
        System.out.println("Please enter a string that includes parenthesis: ");
        checkBalance(user.nextLine());
        user.close();
    }
}