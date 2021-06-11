import java.util.*;

public class BellaJavaSolutions{
    public static void main (String [] args){
        Scanner user = new Scanner(System.in);

        System.out.print ("Enter the number of the lab question you want to do (written as an int): "); 
        int questionNum = user.nextInt();
        
        //This is the proper formatting for a switch case 
        switch (questionNum) { // This line checks for the variable given to the switch case switch(<varaible>)
            case 3: //This is the case that responds if questionNum is 3 
                three(); //You won't have to understand this right now, but it will be helpful for object oriented
            case 5: //This is the case that responds if questionNum is 5
                five(); //The method call for the five method
            case 8: //This is the case that responds if questionNum is 8
                eight(); //the method call for the eight method
            default: //this is the case in the questionNum is not 3, 5, or 8
                System.out.println ("You didn't enter one of the problem numbers.");
        }


    }

    public static void three(){
        Scanner user = new Scanner(System.in);

        double temperature;
        String tempUnit = "a";  //declare variable as an arbitrary value to prevent declaration error
        String inputChar = "a"; //declare variable as an arbitrary value to prevent declaration error
        
        while (inputChar != "Q" || inputChar != "q"){ //condition to quit the program
            System.out.print("Enter the numerical value for the temperature in either Celsius or Fahrenheit: "); 
            temperature = user.nextDouble();
            while (tempUnit != "F" || tempUnit != "f" || tempUnit != "C" || tempUnit != "c"){ //condition that checks for any other character not listed 
                System.out.print ("Enter the unit you would like to convert to: ");
                tempUnit = user.next();
            }
            if (tempUnit == "C" || tempUnit == "c"){
                temperature = (5 * (temperature - 32))/9; 
                System.out.println ("The temperature you entered is " + temperature + " in Celsius");
            }
            if (tempUnit == "F" || tempUnit == "f"){
                temperature = 9 * (temperature/5) + 32;
                System.out.println ("The temperature you entered is " + temperature + " in Fahrenheit");
            }
            System.out.print ("Enter any character to continue or Q to end: ");
            inputChar = user.next();
        }
    }

    public static void five(){
        Scanner user = new Scanner(System.in);

        int largest = -1000; //set arbitrarily small to make sure entered number is larger than it
        int smallest = 1000;// set arbitrarily large to make sure entered number is smaller than it
        int enteredNum=0;
        int count = 1;
        int sum = 0;
        double avg;

        

        do{
            System.out.print ("Enter a positive number: ");
            enteredNum = user.nextInt();
            if (enteredNum > largest){ //logic to check and see if the entered number is larger than the previous instance of the largest number
                largest = enteredNum; //reassigns largest number if entered number is larger
            }
            if (enteredNum < smallest && enteredNum > 0){//logic to check and see if the entered number is smaller than the previous instance of the smallest number
                smallest = enteredNum; //reassigns smallest number if entered number is smaller
            }
            sum += enteredNum;
            count++;//counts up to calculate the denominator value for the average
        }while (enteredNum > 0); //repeat condition

        avg = sum/count; //average calculation

        System.out.println ("Largest: " + largest);
        System.out.println ("Smallest: " + smallest);
        System.out.println ("Average: " + avg);
    }

    public static void eight(){
        Scanner user = new Scanner (System.in);
        int num = (int) (Math.random() * 8) + 1; 
        String response;

        do{
            System.out.print ("Ask the Magic 8-ball a question: ");
            user.next();
            switch (num){ //switch case logic that checks what value the variable num is
                case 1: //proceeds if num == 1
                    System.out.println ("It is certain");
                case 2: //proceeds if num == 2
                    System.out.println ("It is decidedly so");
                case 3: //proceeds if num == 3
                    System.out.println ("Most likely");
                case 4: //proceeds if num == 4
                    System.out.println ("Signs point to yes");
                case 5: //proceeds if num == 5
                    System.out.println ("Reply hazy, try again");
                case 6: //proceeds if num == 6
                    System.out.println ("Ask again later");
                case 7: //proceeds if num == 7
                    System.out.println ("Don’t count on it");
                case 8: //proceeds if num == 8
                    System.out.println ("My sources say no");
            }
            System.out.print ("Would you like to ask another question? (Y or N) ");
            response = user.next();
        }while (response == "Y" || response == "y"); //repeat condition
    }
}