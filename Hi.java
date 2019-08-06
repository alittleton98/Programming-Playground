import java.util.Scanner;
public class Hi {
    public static void main (String [] args){
        
        Scanner user = new Scanner(System.in);
        
        System.out.println ("HI LIBBY! (say hi back)");
        
        String message = user.nextLine();
        
        System.out.println ("You said " + message + ". I Love you");
        
        
        }
    }
