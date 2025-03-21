package ass3;

public class q7 {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},	
            {3, 2, 1}
        };
        
        try {
            int[][] sum = addMatrices(matrix1, matrix2);
            printMatrix(sum, "Sum of matrices");

            int[][] product = multiplyMatrices(matrix1, matrix2);
            printMatrix(product, "Product of matrices");

            int[][] transpose = transposeMatrix(matrix1);
            printMatrix(transpose, "Transpose of matrix1");

            System.out.println("Accessing an invalid matrix element: " + matrix1[3][3]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an element outside the matrix bounds.");
        }
    }

    public static int[][] addMatrices(int[][] m1, int[][] m2) {
        int rows = m1.length;
        int cols = m1[0].length;
        
        if (rows != m2.length || cols != m2[0].length) {
            throw new IllegalArgumentException("Matrices must be of the same dimensions for addition.");
        }

        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(int[][] m1, int[][] m2) {
        int rows1 = m1.length;
        int cols1 = m1[0].length;
        int rows2 = m2.length;
        int cols2 = m2[0].length;

        if (cols1 != rows2) {
            throw new IllegalArgumentException("Number of columns in matrix1 must be equal to the number of rows in matrix2.");
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix, String message) {
        System.out.println(message + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

