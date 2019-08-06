import java.util.*;

public class JavaTestDoc{
    
    public static Scanner user = new Scanner(System.in);

    public static void main (String [] args){
        //Scanner user = new Scanner(System.in);

        String response;
        double length = 0;
        double width = 0;

        System.out.print("Type length: ");
        response = user.nextLine();
        length = promptDouble(response);
        user.nextLine();
        System.out.print("type width: ");
        response = user.nextLine();
        width = promptDouble(response);
        
        
        System.out.println (perimeter(length, width));
        System.out.println(area(length, width));

    }

    public static double promptDouble (String prompt){
        if (prompt.equals("length")){
            System.out.print("Enter the length value: ");
            return user.nextDouble();
        }
        if (prompt.equals("width")){
            System.out.print("Enter the width value: ");
            return user.nextDouble();
        }
        else{
            return 0;
        }

    }

    public static double perimeter (double l, double w){
        final double height = 8;
        double wallArea = (l + w)*height;
        return wallArea;
    }

    public static double area (double l, double w){
        double ceilingArea = l * w;
        return ceilingArea;
    }
}