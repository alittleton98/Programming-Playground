 import java.util.Scanner;
    public class Q2 {

public static void main(String[] args) {

    String input = "";
    char noSpace = ' ';

    Scanner scan = new Scanner(System.in);
    input = scan.nextLine();
    System.out.println(input);

    for (int i = 0; i < input.length(); i++) { //search from right to left
        for (int j = input.length(); j != -1; j--) { //search from left to right
            if (input.charAt(i) == noSpace) { //if there is a space move position of i and j
                i++;
                j--;
            }




    }
    System.out.println(input);
        }
    }   
}

