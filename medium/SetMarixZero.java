
/*Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix. */
public class SetMarixZero {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // System.out.println("Element at (" + i + "," + j + ") is: " + matrix[i][j]);
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < row; k++) {
                        if (matrix[i][k] != 0) {
                            matrix[i][k] = 2;
                        }
                    }
                    for (int k = 0; k < col; k++) {
                        if (matrix[k][j] != 0) {
                            matrix[k][j] = 2;
                        }

                    }

                }

            }
        }

System.out.println("marked elements: as 2 which will be set to zero");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // System.out.println("Element at (" + i + "," + j + ") is: " + matrix[i][j]);

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }


        System.out.println("After setting zeros:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (matrix[i][j] == 2) {
                    matrix[i][j] = 0; // Set the marked elements to zero
                }
            }

        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // System.out.println("Element at (" + i + "," + j + ") is: " + matrix[i][j]);

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}
