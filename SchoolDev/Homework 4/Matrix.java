import java.io.IOException;
import java.io.PrintWriter;

public class Martix{

    int numRows;
    int numCols;
    int [][] matrix;

    public Matrix (int n, int m){
        numRows = n;
        numCols = m;
        matrix = new int [numRows] [numCols];
    }

    public Matrix add (Matrix mat){
        if (this.numRows == mat.numRows && this.numCols == mat.numCols){
            Matrix p = new Matrix(mat.numRows, mat.numCols);
        }
        else{
            throw new Exception();
        }
    }

    public static Matrix transpose (Matrix m){
        Matrix mat = new Martix (m.numCols, m.numRows);

        return mat;
    }

    public static Matrix genMatrix (int m, int n){
        Matrix mat = new Matrix (m,n);
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                mat.matrix[i][j]=i+j;
            }
        }
        return mat;
    }

    public Matrix subtract (Matrix mat){
        if (this.numRows == mat.numRows && this.numCols == mat.numCols){
            Matrix p = new Matrix (numRows, numCols);
            for (int i = 0; i < p.numRows; i++){
                for (int j = 0; j < p.numCols; j++){
                    p.matrix[i][j] = matrix[i][j] - mat.matrix[i][j];
                }
            }//Time compelxity = O(m*n)
        }
        else{
            throw new Exception();
        }
    }

    public Matrix scalarMult (int constant){
        Matrix p = new Matrix (numRows, numCols);
        for (int i = 0; i < p.numRows; i++){
            for (int j = 0; j < p.numCols; j++){
                p.matrix[i][j] = (matrix [i][j]) * constant;
            }
        }
    }//Time complexity = O(m*n)

    public void printMatrix () throws IOException{
        PrintWriter pw = new PrintWriter("matrix_output.txt", "UTF-8 ");
        pw.println("Matrix is of dimension " + this.numRows + " rows by " + this.numCols + " columns.");
        for (int i = 0; i < this.numRows; i++){
            for (int j = 0; j < this.numCols; j++){
                pw.println(this.numRows + " " + this.numCols + "\n");
            }
        }
    }

    public static void main (String [] args){
        Matrix q = Matrix.genMatrix(5,10);
    }
}