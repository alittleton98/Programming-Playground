import java.util.ArrayList;

public class WordPermutations{

    static HashSet<String> dictionary = new HashSet<String>();
    static ArrayList<String> words = new ArrayList<String>();


    public static void dictionary(){
        Scanner reader = null;
        try { 
            reader = new Scanner(new File("EnglishWordList.txt"));
        }
        catch ( FileNotFoundException ex){
            System.out.println(ex+"  file not found ");
        }
        while (reader.hasNext()){
            String str = reader.next();
            str = str.replaceAll("[\\[\\]_:\"'`?;\\â€0-9â€”;â€œ()-/.,*! ]", "").toLowerCase();
            dictionary.add(str);
        }
    }

    public static void SpellCheck(String word){
        
            if (dictionary.contains(word)){
                System.out.println(word);
                words.add(word);
            }
        
    }

    public static void permutation(String w) { 
        permutation("", w); 
    }
    
    private static void permutation(String prefix, String word) {
        int n = word.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + word.charAt(i), word.substring(0, i) + word.substring(i+1, n));
        }
        SpellCheck(word);
        
    }

    public static void main (String [] args){
        dictionary();
        String word;
        Scanner user = new Scanner(System.in);

        System.out.println("Please enter a series of characters with no spaces:");
        
        word = sc.nextLine();
        
        int n = word.length();
        
        for(int i = 0; i < n; i++){
            permutation(word);
        }
        System.out.println(words);
       
        user.close();
    }
}