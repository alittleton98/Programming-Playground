import java.util.Scanner;
public class Maximum{
    public static void main (String [] args){
        
        Scanner user = new Scanner (System.in);
        int a;
        int b;
        int c;
        
        System.out.print ("Please enter a number ");
        a = user.nextInt();
        System.out.print ("Please enter another number ");
        b = user.nextInt();
        System.out.print ("Please enter one last number ");
        c = user.nextInt();
        
        if (a > b && a > c){
             System.out.println (a + " is the largest of the entered numbers");
        }
        else if (b > a && b > c){
             System.out.println (b + " is the largest of the entered numbers");
        }
        else if (c > a && c > b){
             System.out.println (c + " is the largest of the entered numbers");
        }
    }
}