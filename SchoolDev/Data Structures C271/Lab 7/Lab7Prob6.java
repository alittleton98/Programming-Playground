import java.util.*;
import java.io.*;

public class Lab7Prob6{

    static LinkedList<String> dictionary;

    public Lab7Prob6(){
        dictionary = new LinkedList<String>();    
    }

    public static void readDictionary(){
        
        Scanner dictionaryScanner;
        
        dictionaryScanner = new Scanner(new File("EnglishWordList.txt"));
        while (fileScanner.hasNext()){
            String line = dictionaryScanner.nextLine();
            dictionary.add(line);
        }
    }

    public static void readFile (){

        Scanner fileScanner;

        fileScanner = new Scanner(new File("BillyGoatGruff.txt"));
        while (fileScanner.hasNext()){
            String line = fileScanner.nextLine();
            String[] words = line.split("\\s");

            for (int i = 0; i < words.length ; i++){
                if (!dictionary.contains(words[i])) {
                    System.out.print(word[i]);
                }
            }
        }
    }


}