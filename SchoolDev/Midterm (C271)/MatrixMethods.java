import java.util.*;

public class MatrixMethods{
 

    public static void rowSums(int [][] matrix){
        int sum = 0;
        for (int row = 0; row < matrix.length; row++){
            int rowNum = row;
            for (int col = 0; col < matrix[row].length; col++){
                sum += matrix[rowNum][col];
            }
            System.out.print (sum + ",");
        }
    }

    public static void columnMins (int [][] matrix){
        
        int minimum = 0;
        for (int row = 0; row < matrix.length; row++){
            int rowNum = row;
            for (int col = 0; col < matrix[row].length; col++){
                int colNum = col;
                if (matrix[row][colNum] < matrix[rowNum][colNum+1]){
                    minimum = matrix[row][colNum];
                }
            }
            System.out.print (minimum + ",");
        }
    }
    
    public static void main (String [] args){

        Scanner user = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int areaFactor = user.nextInt();
        int [][] matrix = new int [areaFactor][areaFactor];
        
        for(int r = 0; r < areaFactor; r++){
            for (int c = 0; c < areaFactor; c++){
                matrix[r][c] = r+c;
            }
            
        }
        
        rowSums(matrix);
        columnMins(matrix);
        
    }
}