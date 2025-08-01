/*Problem Statement: Given a matrix, your task is to rotate the matrix 90 degrees clockwise. */
public class Rotate90D {

    public static void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int maxtrix2[][] =new int[row][col];
        
        for(int i=0; i<row; i++)
        {
            for(int j=col-1; j>=0; j--)
            {
                maxtrix2[i][col-1-j] = matrix[j][i];


                // System.out.print( matrix1[j][i] + " ");
            }
            // System.out.println(); // New line after each row
        }


        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(maxtrix2[i][j] + " ");

                // System.out.print( matrix1[j][i] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
    public static void main(String[] args) {
        int matrix1[][] ={{1,2,3},{4,5,6},{7,8,9}};

        int row = matrix1.length;
        int col = matrix1[0].length;
        
        System.out.println("Original Matrix:");
         for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(matrix1[i][j] + " ");

                // System.out.print( matrix1[j][i] + " ");
            }
            System.out.println(); 
        
        }

         System.out.println("Rotated Matrix:");
        rotate(matrix1);
       
    }
}