public class FlipSqrSubmartix {

    public static void main(String[] args) {
        int [][]grid = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int x = 1, y = 0, k = 3;

        int row = grid.length;
        int col = grid[0].length;
        int mat1[][] = new int[row][col];
        
        // Copying original matrix to new matrix 
        //***System.arraycopy**-> is a built-in Java method used to efficiently copy elements from one array to another.
        for(int i=0; i<row; i++)
        {
            System.arraycopy(grid[i],0,mat1[i],0,col);
        }
        

        for(int i=0; i<k/2; i++)
        {
            for(int j=y; j<k+y; j++)
            {
                int temp = mat1[x+i][j];
                mat1[x+i][j] = mat1[x+k-1-i][j];
                mat1[x+k-1-i][j] = temp;
            }
            System.out.println();
        }

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
    }
}