import java.util.Scanner;
public class FirstProgram{
    public static void main (String [] args){
        
        Scanner user = new Scanner (System.in);
        
        System.out.println ("HELLO WORLD");
        System.out.print ("What is your name ");
        String name = user.nextLine();
        System.out.println ("Hello " + name + "!");
        System.out.print ("What's your favorite kind of music? ");
        String music = user.nextLine();
        System.out.println ("Wow that's so cool! I have to go now. Run me again to have another conversation. BYE!");
    }
}