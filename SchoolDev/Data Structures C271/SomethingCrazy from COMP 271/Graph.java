
import java.util.*;


public class Graph
{
    int numVertex;
    int numEdge;
    ArrayList<ArrayList<Integer>> graph;
    
    public Graph(){
        numEdge=0;
        graph = new ArrayList<ArrayList<Integer>>();
       // for (int i=0;i<numVertex;i++)
        //graph.add(new ArrayList<Integer>());
    }
    
    public void addEdge (int i, int j) {
        // get the horizontal arraylist at location i
        // then add j to it
        // repeat for location j
       
        ArrayList<Integer> temp1 = graph.get(i);
        temp1.add(j);
        ArrayList<Integer> temp2 = graph.get(j);
        temp2.add(i);
        numEdge++;
    }
    
    public void addVertex(int i) {
        
     graph.add(i,new ArrayList<Integer>());   
     numVertex++;
    }
    
    public boolean checkEdge(int i, int j) {
        // first get the horizontal arraylist at location i
        // check if the arraylist contains j
        
       return(graph.get(i).contains(j));
      
    }
    
    
    public int degree (int i) {
       
        return (graph.get(i).size());
    }
    public void createGraph() {
       addEdge(0,1);
       addEdge(1,2);
       addEdge(0,3);
       
       //  for each edge in the file
       // get the i and j
       // and call addEdge (i,j);
    }

   
   
}
