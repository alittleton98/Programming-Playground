//Sammy worked to write the solution to this program based on the code written from the website provided.
//Sammy and Andrew collaborated on problem 3, but Sammy drew the diagram due to better handwritting.



import java.util.*;

public class recursiveMaze
{
    
    public void print(int solution[][]){
        int count = 0;
        for(int i = 0; i < solution.length; i++){
            for(int j = 0; j < solution.length; j++){
                if(count > solution.length-1){
                    count = 0;
                    System.out.println();
                }
                System.out.print(solution[i][j] + ",");
                count++;
            }
        }
        
    }
    
    
    boolean checkSafe(int maze[][], int x, int y){
        if (x>= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1){
            return true;
        }
        return false;
    }
    // BACKUP SOLVEMAZE
    /*
    boolean solveMaze(int maze[][]){
        int solution[][] = new int[maze.length][maze.length];
        int count = 0;
        if(solver(maze,0,0,solution) == false){
                   System.out.println("No solution");
                   for(int i = 0; i < solution.length; i++){
                        for(int j = 0; j < solution.length; j++){
                            if(count > solution.length-1){
                                count = 0;
                                System.out.println();
                            }
                            System.out.print(solution[i][j] + ",");
                            count++;
                        }
                    }
                   return false;
                }
   
        print(solution);
        return true;
    }
    */
    
    boolean solveMaze(int maze[][]){
        
        int count = 0;
        if(solver(maze,0,0,maze) == false){
                   System.out.println("No solution");
                   for(int i = 0; i < maze.length; i++){
                        for(int j = 0; j < maze.length; j++){
                            if(count > maze.length-1){
                                count = 0;
                                System.out.println();
                            }
                            System.out.print(maze[i][j] + ",");
                            count++;
                        }
                    }
                   return false;
                }
   
        print(maze);
        return true;
    }
    boolean solver(int maze[][], int x, int y, int[][] solution){
        
        if(x == maze.length-1 && y == maze.length-1){
            solution[x][y] = 1;
            return true;
        }
        if(checkSafe(maze, x, y)==true){
            solution[x][y] = 1;
            
            if(solver(maze, x+1, y, solution)){
                return true;
                
            
            }
            else if(solver(maze, x, y+1, solution)){
                return true;
            }   
            else{
                solution[x][y] = 0;
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args){
        
        
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a matrix size: ");  
        int n = sc.nextInt();
        int maze[][] = new int[n][n];
        
        
        
        
        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[i].length; j++){
                maze[i][j] = r.nextInt(2);
                
            }
        }
        
        maze[0][0] = 1;
        /*
        int maze[][] = {{1,1,0,0},
                        {0,1,0,1},
                        {0,1,0,0},
                        {1,1,1,1}};
                       
        /*
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                maze[i][j] = 0;
            }
        }
        */
        recursiveMaze itMaze = new recursiveMaze();
        itMaze.solveMaze(maze);
        sc.close();
    }
    
}


