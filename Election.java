import java.util.Scanner;
public class Election{
    /*
    Declare variables that will be used in the program
        -Scanner for user input
        -int for the user's age
        -int for user's citizenship age
    State intentions of program
    Ask user for information (age and citizenship)
    Store each user input into their appropriate variables
    Use a conditional to determine eligibility
        -check if user is or is older than 25
        -if true: check if they have been a citizen for at least 7 years
            -if true: Say they can be a member of the House and check if they are 30 or older
                -if 30 or older is true: check for 9+ years of citizenship:
                    -if true: say they can be a member of the US senate
                    if false: say they cannot be a member of congress
            -if false: say they cannot be a member of congress because they won't fit the other criteria if they don't fit this one
        -if false: say they cannot be a member of congress because they won't fit the other criteria if they don't fit this one
            
    */
    public static void main (String [] args){
        
        Scanner user = new Scanner(System.in);
        int age;
        int citizen;
        
        System.out.println ("Hello. I'm here to determine if you can be a US Congressperson or Senator based on your age and years of US citizenship.");
        System.out.print ("Please enter your age: ");
        age = user.nextInt();
        System.out.print ("Please enter the number of years you've been a US citizen: ");
        citizen = user.nextInt();
        
        if(age >= 25){
            if (citizen >= 7){
                System.out.println ("You can be a member of the US House of Representatives");
            }
            else{
            System.out.println ("Unfortunately you cannot be a member of the United States Congress.");
            }
            if (age >= 30){
                if (citizen >= 9){
                    System.out.println ("You can be a memeber of the US Senate");
                }
            }
        }
        else{
            System.out.println ("Unfortunately you cannot be a member of the United States Congress.");
        }
        user.close();
    }
}