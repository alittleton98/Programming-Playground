
/**
 * Write a description of class ReadFiles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;

public class SpellCheck
{
        static HashSet<String> dictionary = new HashSet<String>();
      static ArrayList<String> story = new ArrayList<String>();
      static ArrayList<String> words = new ArrayList<String>();
      static HashMap<Integer,String> wordMap = new HashMap<Integer,String>();

   public void storeDictionaryAndStory() {
        Scanner reader=null;
        try { reader = new Scanner(new File("EnglishWordList.txt"));
           }
            catch ( FileNotFoundException ex)
    {System.out.println(ex+"  file not found ");
            }
    while (reader.hasNext()){
   String str = reader.next();
   str = str.replaceAll("[\\[\\]_:\"'`?;\\â€0-9â€”;â€œ()-/.,*! ]", "").toLowerCase();
   dictionary.add(str);
   
}

try { 
    reader = new Scanner(new File("Automotive_5.txt"));
           }
    catch ( FileNotFoundException ex)
    {System.out.println(ex+"  file not found ");
            }
    while (reader.hasNext()){
   String str = reader.next();
   str = str.replaceAll("[\\[\\]_:\"'`?;\\â€0-9â€”;â€œ()-/.,*! ]", "").toLowerCase();
   story.add(str);
}
}

public static void spellCheck () {
    
    for (String s:story) 
     if (dictionary.contains(s)){
             words.add(s);
     }
}

public static void frequency(){
        int greatestCount = 0;
        int lowestCount = 10;
        int tempCount;
        for (int i = 0; i < words.size(); i++){
                tempCount = Collections.frequency(words, words.get(i));
                wordMap.put(tempCount, words.get(i));
                if ( tempCount > greatestCount){
                        greatestCount = tempCount;
                }
                if ( tempCount < lowestCount){
                        lowestCount = tempCount;
                }
        }

        System.out.println(wordMap.get(greatestCount) + " has the highest frequency of " + greatestCount);
        System.out.println(wordMap.get(lowestCount) + " has the lowest frequency of " + lowestCount);
}

public void spellCheckNoDuplicates() {
    
    HashSet<String> badWords = new HashSet<String>();
     for (String s:story) 
     if (!dictionary.contains(s))
       badWords.add(s);
       
     System.out.println(badWords);
     System.out.println(badWords.size());
}

public static void main (String [] args){
        
        spellCheck();
        frequency();
}
}