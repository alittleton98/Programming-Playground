
/**
 * Write a description of class ReadFiles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;

public class ReadFiles
{
    HashSet<String> dictionary = new HashSet<String>();
      ArrayList<String> story = new ArrayList<String>();
   public void storeDictionaryAndStory() {
        Scanner reader = null;
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
    reader = new Scanner(new File("WinnieThePoohStories.txt"));
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

    public void SpellCheck(){
        for (int i = 0; i < story.size(); i++){
            if (!dictionary.contains(story.get(i))){
                System.out.println(story.get(i));
            }
        }
    }

    public void SpellCheckNoDuplicates(){
        HashSet<String> badWords = new HashSet<String>();
        for (String s:story){
            if (!dictionary.contains(s)){
                badWords.add(s);
            }
        }
        System.out.println(badWords);
        System.out.println(badWords.size());
    }
    public static void main (String [] args){
        SpellCheck();
        SpellCheckNoDuplicates();
    }
}