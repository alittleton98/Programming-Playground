import java.util.*;
import java.io.*;

public class Problem9 {

    public static void readFile() {

        int highestSal = 0;
        Scanner fileScanner;
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> salary = new ArrayList<Integer>();
        try {
            fileScanner = new Scanner(new File("FullTimeEmployees.txt"));
        } catch (Exception e) {
            fileScanner = new Scanner(System.in);
            System.out.println("FILE NOT FOUND");
            fileScanner.close();
            System.exit(0);
        }

        while (fileScanner.hasNext()) {
            names.add(fileScanner.nextLine());
            salary.add(fileScanner.nextInt());
        }

        for (int i = 0; i < salary.size(); i++) {
            if (salary.get(i) > highestSal) {
                highestSal = salary.get(i);
            }
        }

        System.out.println(highestSal);
    }
}