import java.util.*;
import java.io.*;


public class DatabaseMain extends Graph{
        static Graph g = new Graph();
        static Scanner fileScanner;
        static HashSet<String> allNodes = new HashSet<String>();
        static HashSet<String> allActors = new HashSet<String>();
        static HashSet<String> allMovies = new HashSet<String>();
    public static void readFile(){
        
        try{
            int numNodes = 0;
            int numMovies = 0;
            int numActors = 0;
            int numEdges = 0;
            String pathname = "movies.txt";
            fileScanner = new Scanner(new File(pathname));
            //loops every carriage return
            while(fileScanner.hasNext()){
                //splits carriage return chunk into actors and movies (index 0 is movie always) 
                String line = fileScanner.nextLine();
                String[] cast = line.split("/");
                // for referencing the current movie index in g.addEdge
                int currentMovie = numNodes;
                // loops through cast, assigns index 0 to a new vertex (since its a movie), 
                for(int i = 0; i < cast.length; i++){
                    // if movie, add to vertex and HashSet allNodes, increment numMovies and numNodes for amount of movies/total nodes
                    if(i == 0){
                        allNodes.add(cast[0]);
                        allMovies.add(cast[0]);
                        g.addVertex(i);
                        numMovies++;
                        numNodes++;
                        continue;
                    }/*
                    else{
                        g.addVertex(i);
                        g.addEdge(currentMovie, i);
                        numEdges++;
                    }*/
                    //checks for dupes between cast[i] and allNodes hashset
                    else if(!allNodes.contains(cast[i])){
                        g.addVertex(i);
                        allActors.add(cast[i]);
                        g.addEdge(currentMovie, i);
                        numEdges++;
                        numActors++;
                    }
                    
                }
                //answers questions at the end 
                System.out.println("Number of unique movies: " + numMovies + "." + "Number of unique actors: " + numActors
                + "." + "Number of edges: " + numEdges + ".");
                //System.out.println(allNodes);
            }
        }
        catch(Exception e){
            System.out.println("file not found");
        }
    }
//To add: populate movie arraylists with actors, and actor arraylists with movies.. then we can check for what movies each 
// actor is in and what actor is in each movie...
//then done?
    public void getFeaturedMovies(int actor){
        for (int j = 0; j < allNodes.size(); j++){
            if (g.checkEdge(j, actor)){
                System.out.println(j);
            }

        }
    }

    public static void coCast (int minMovies){
        int count = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        for (i = 0; i < allActors.size(); i++){
            for (j = 0; j < allActors.size(); j++){
                for (k = 0; k < allMovies.size(); k++){
                    if (g.checkEdge(i,k) && g.checkEdge(j,k)){
                        count++;
                    }
                }
            }
        }
        if (count >= minMovies){
            System.out.println(i + " " + j);
        }
    }
    public static void main(String[] args){
        //readFile();
        coCast(13);
    }


}