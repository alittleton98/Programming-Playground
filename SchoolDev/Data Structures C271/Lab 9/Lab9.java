import java.util.*;
import java.io.*;

public class Lab9{

    static ArrayList<String> story;
    static HashSet<String> dictionary = new HashSet<String>();
    public Lab9(){
         

    }

    public static void readDictionary(){
        
        Scanner dictionaryScanner;
        try{
            dictionaryScanner = new Scanner(new File("EnglishWordList.txt"));
            while (dictionaryScanner.hasNext()){
            String line = dictionaryScanner.nextLine();
            line = line.replaceAll("[\\[\\]_:\"'`?;0-9;()-/.,*! ]", "").toLowerCase();
            dictionary.add(line);
            }
        }
        catch(Exception e){
            System.out.println ("No file");
        }
    }

    public static void readFile (){

        Scanner fileScanner;
        try{
            fileScanner = new Scanner(new File("WinnieThePoohStories.txt"));
            while (fileScanner.hasNext()){
            String line = fileScanner.nextLine();
            line = line.replaceAll("[\\[\\]_:\"'`?;0-9;()-/.,*! ]", "").toLowerCase();
            String[] words = line.split("\\s");

                for (int i = 0; i < words.length ; i++){
                    if (!dictionary.contains(words[i])) {
                    System.out.print(words[i]);
                    System.out.println();
                    }
                }
                }
            }
        catch(Exception e){
            System.out.println ("No file");
        }

    }
        
    public static void main (String [] args){
        readDictionary();
        readFile();
    }
}