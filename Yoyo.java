import java.util.Scanner;
public class Yoyo {
    public static void main (String [] args){
        
        Scanner user = new Scanner (System.in);
        
        System.out.println ("HELLO WORLD");
        System.out.print ("enter a number ");
        int name1 = user.nextInt();
        System.out.println ("you entered " + name1 + "!");
        System.out.print ("enter another number ");
        int music = user.nextInt();
        System.out.println ("do you want the average of the numebrs? ");
        String answer = user.nextLine();
        System.out.println ("You said " + answer);
        // if (answer == "yes"){
          //  System.out.println ((name1 + music)/2);
        //}
        //else{
          //  System.out.println ("oh ok"); 
        }
    }
//}