
/**
 * Write a description of class FileRead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class FileRead
{
    public static void main (String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        ArrayList<String> dupList = new ArrayList<String>();
        int count = 0;
        int duplicates = 0;
        String duplicateCheck;
        Scanner reader=null;
        try { reader = new Scanner(new File("EnglishWordList.txt"));
           }
            catch ( FileNotFoundException ex)
    {System.out.println(ex+"  file not found ");
            }
    while (reader.hasNext()){
   String str = reader.nextLine();
   count++;
   if (al.contains(str)){
       al.add(str);
    }
   else{
       dupList.add(str);
       duplicates++;
    }
   
}
System.out.println(count);
System.out.println(duplicates);
}
}
