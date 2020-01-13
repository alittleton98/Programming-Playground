//Andrew wrote this program 

import java.util.*;

public class IterativeMaze{
    private Random r = new Random();
    static Stack<Integer> solutionStack = new Stack<Integer>();
    static int[][] maze;
    static int size;
    public IterativeMaze(){
        maze = new int[4][4];
        for (int i = 0; i < maze.length; i++){
            for (int j = 0; j< maze[i].length; j++){
                maze[i][j] = r.nextInt(2);
            }
        }
    }
    public IterativeMaze(int n){
        size = n;
        maze = new int[size][size];
        for (int i = 0; i < maze.length; i++){
            for (int j = 0; j< maze[i].length; j++){
                maze[i][j] = r.nextInt(2);
                maze[0][0] = 1;
            }
        }
    }
    public static void printMaze(){
        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[i].length; j++){
                System.out.printf("%5d ", maze[i][j]);
            }
                System.out.println();
        }
    }
    
    public static void generateSolution(){
        int i = 0;
        int j = 0;        
        
        while (i != maze.length && j != maze[i].length){
            
            for (i = 0; i < maze.length-1; i++){
                for (j = 0; j < maze[i].length-1; j++){
                    if (maze[i+1][j] == 1){
                        solutionStack.push(maze[i+1][j]);
                        i++;
                    }
                    else if (maze[i][j+1] == 1){
                        solutionStack.push(maze[i][j+1]);
                        j++;
                    }
                    else{
                        if (solutionStack.empty()){
                            if (j == 0 && i > 0){
                                i--;
                            }
                            if (i == 0 && j > 0){
                                j--;
                            }
                        }
                        else{
                            solutionStack.pop();
                            if (j == 0 && i > 0){
                                i--;
                            }
                            if (i == 0 && j > 0){
                                j--;
                            }
                        }
                    }
                }
            }
            
            if (i == maze.length-1 && j < maze[i].length-1){ 
                for (j = j; j < maze[i].length; j++){
                    if (maze[i][j+1] == 1){
                        solutionStack.push(maze[i][j+1]);
                    }
                    else{
                        if (solutionStack.empty()){
                            i--;
                        }
                        else{
                            solutionStack.pop();
                            i--;
                        }
                    }
                }
            }

            if (j == maze[i].length-1 && i < maze.length-1){
                for (i = i; i < maze.length-1; i++){
                    if (maze[i+1][j] == 1){
                        solutionStack.push(maze[i+1][j]);
                    }
                    else{
                        if (solutionStack.empty()){
                            j--;
                        }
                        else{
                            solutionStack.pop();
                            j--;
                        }
                    }
                }
            }

            if (i > 0 && j > 0 && i < maze.length && j < maze[i].length){
                for (i = i; i < maze.length; i++){
                    for (j = j; j < maze[i].length; j++){
                        if (maze[i+1][j] == 1){
                            solutionStack.push(maze[i+1][j]);
                        }
                        else if (maze[i][j+1] == 1){
                            solutionStack.push(maze[i][j+1]);
                        }
                        else if (maze[i-1][j] == 1){
                            solutionStack.push(maze[i-1][j]);
                        }
                        else{
                            if (solutionStack.empty()){
                                j--;
                            }
                            else{
                                solutionStack.pop();
                                j--;
                            }
                        }
                    }
                }
            }
        }
        if (i == 0 && j == 0){
            if (maze[i+1][j] == 1){
                solutionStack.push(maze[i+1][j]);
            }
            else if (maze[i][j+1] == 1){
                solutionStack.push(maze[i][j+1]);
            }
            else{
                System.out.println("No Solution");
            }
        }
        if (solutionStack.empty() || maze[size][size] == 0){
            System.out.println("No Solution");
        }
        
        else{
            while (!solutionStack.empty()){
                System.out.println(solutionStack.pop());
            }
        }
    }
    boolean checkSafe(int maze[][], int x, int y){
        if (x>= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1){
            return true;
        }
        return false;
    }
    public static void main (String [] args){
        Scanner user =  new Scanner(System.in);
        int size;
        System.out.print("Enter a number for the maze size: ");
        size = user.nextInt();
        IterativeMaze maze = new IterativeMaze(size);
        printMaze();
        generateSolution();
        user.close();
    }
}