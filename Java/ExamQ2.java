import java.util.Scanner;
public class ExamQ2{
    /*
    Declare necessary variables ot use throughout program:
        -Scanner for user input
        -arrays for the numbers and guesses
        -ints to traverse each array
    Gather user input for guesses and then send both arrays to isNumbersPresent to determine if they are there
        Check to see if numbers are below 100 or greater than 0
            if true: break
            if false: continue and add that number to the array called guesses
        traverse each array and determine if one of the numbers is present in the array
        if true: return true
        if false: return false
    check to see if isNumbersPresent returned True or False
    Print the results for the User
    */
    public static void main (String [] args){
    Scanner user = new Scanner(System.in);
    int numbers[] = {3,4,5,2,3,99,17,9};
    int guesses[] = new int [8];
    int a = 0;
    System.out.println ("I have created an array with 8 numbers in it. You can guess at all of them or as few as you please.");
    for (a = 0; a < guesses.length; a++){
        System.out.print ("Enter a guess for the numbers: ");
        if (user.nextInt() > 99 || user.nextInt() < 0){
            return;
        }else{   
        guesses[a] = user.nextInt();
        }
    }
    
    if (isNumbersPresent (numbers, guesses) == true){
        System.out.println ("Good Guesses");
    }
    else{
        System.out.println ("You failed");
    }
}
    public static boolean isNumbersPresent(int[] numbers, int[] guesses){
        int i = 0;
        int k = 0;
        
        for (i = 0; i < numbers.length; i++){
            for (k = 0; k < guesses.length; i++){
                if (guesses[k] == numbers[i]){
                    return true;
                    }
                }
            }
            return false;
    }
        
}
