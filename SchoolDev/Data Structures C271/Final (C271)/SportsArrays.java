import java.util.*;

public class SportsArrays{
    static String[] soccerPlayers;
    static String[] volleyballPlayers;
    static ArrayList<String> arrListSoccer = new ArrayList<String>();
    static ArrayList<String> arrListVolleyball = new ArrayList<String>();
    static ArrayList<String> allPlayers = new ArrayList<String>();

    public static void ArrayListCoversionSoccer (String[] arr){
        for (int i = 0; i < arr.length; i++){
            arrListSoccer.add(arr[i]);
        }
    }
    public static void ArrayListCoversionVolleyball (String[] arr){
        for (int i = 0; i < arr.length; i++){
            arrListVolleyball.add(arr[i]);
        }
    }
    
    public static ArrayList<String> soccerOnly(){
        ArrayList<String> soccerOnly = new ArrayList<String>();
        ArrayListCoversionVolleyball(volleyballPlayers);

        for (int i = 0; i < soccerPlayers.length; i++){
            if(!arrListVolleyball.contains(soccerPlayers[i])){
                soccerOnly.add(soccerPlayers[i]);
            }
        }
        return soccerOnly;
    }

    public static ArrayList<String>  volleyballOnly(){
        ArrayList<String> volleyballOnly = new ArrayList<String>();
        ArrayListCoversionSoccer(soccerPlayers);

        for (int i = 0; i < volleyballPlayers.length; i++){
            if (!arrListSoccer.contains(volleyballPlayers[i])){
                volleyballOnly.add(volleyballPlayers[i]);
            }
        }
        return volleyballOnly;
    }

    public static ArrayList<String> bothSports(){
        ArrayList<String> bothSports = new ArrayList<String>();
        ArrayListCoversionSoccer(soccerPlayers);
        ArrayListCoversionVolleyball(volleyballPlayers);
        
        for (int i = 0; i < allPlayers.size(); i++){
            if (arrListSoccer.contains(allPlayers.get(i)) && arrListVolleyball.contains(allPlayers.get(i))){
                bothSports.add(allPlayers.get(i));
            }
        }
        return bothSports;
    }

    public static void printOut (ArrayList<String> arrList){
        if (arrList.size() == 0){
            System.out.println("Structure is empty");
        }
        for (int i = 0; i < arrList.size(); i++){
            System.out.println(arrList.get(i));
        }
    }
    public static void main (String [] args){
        soccerPlayers = new String[] {"John", "Gavin", "Adam", "Bella", "Andrew", "Annie", "Isabella", "Mark", "Geoff"};
        volleyballPlayers = new String[] {"John", "Geoff", "Isabella", "Adrian", "Mark", "Lance", "Parker", "Troy"};

        for (int i = 0; i < soccerPlayers.length; i++){
            if (!allPlayers.contains(soccerPlayers[i])){
                allPlayers.add(soccerPlayers[i]);
            }
        }
        for (int i = 0; i < volleyballPlayers.length; i++){
            if (!allPlayers.contains(volleyballPlayers[i])){
                allPlayers.add(volleyballPlayers[i]);
            }
        }

        System.out.println("Soccer Only: ");
        printOut(soccerOnly());
        System.out.println();
        System.out.println("Volleyball Only: ");
        printOut(volleyballOnly());
        System.out.println();
        System.out.println("Both Sports: ");
        printOut(bothSports());
        System.out.println();
    }
}