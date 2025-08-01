/*Problem Statement: Given a Matrix, print the given matrix in spiral order. */

import java.util.ArrayList;

public class PrintSpiralMat {
    public static void main(String[] args) {
        int Matrix[][] = { { 1, 2, 3, 4 },
		      { 5, 6, 7, 8 },
		      { 9, 10, 11, 12 },
	              { 13, 14, 15, 16 } };
        int row = Matrix.length;
        int col = Matrix[0].length;
        int top=0, bottom=row-1, right=col-1, left=0;

        ArrayList<Integer> result = new ArrayList<>();

        while(top<=bottom && left<=right)
        {
            //move left to right it alreay cover a matrix[0][0] to matrix[0][col-1]
            for(int i=top; i<=right; i++)
            {
                result.add(Matrix[top][i]);
            }
            top++;

            //move top to bottom it alreay cover a matrix[1][3] to matrix[3][row-1]
            for(int i=top; i<=bottom; i++)
            {
                result.add(Matrix[i][right]);
            }
            right--;

            //move right to left it alreay cover a matrix[3][2] to matrix[3][0]
            for(int i=right; i>=left;i--)
            {
                result.add(Matrix[bottom][i]);
            }
            bottom--;

            //move bottom to top
            for(int i=bottom; i>=top; i--)
            {
                result.add(Matrix[i][left]);
            }
            left++;

        }

        System.out.println(result);
    }
}
