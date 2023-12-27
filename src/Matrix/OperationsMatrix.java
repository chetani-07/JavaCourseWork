package Matrix;

public class OperationsMatrix {

    //Method to Print Matrix.
    public static void printMatrix(int matrix[][], int m, int n) {
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col] + "  ");
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

    //Method to Search an Element into given Matrix.
    public static boolean searchMatrix(int[][] matrix, int m, int n, int num) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    //Method to Add Two Given Matrices.
    public static int[][] addMatrices(int[][] mat1, int[][] mat2, int m, int n) {
        int[][] res = new int[m][n];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                res[row][col] = mat1[row][col] + mat2[row][col];
            }
        }
        return res;
    }

    //Method to perform subtraction among matrices.
    public static int[][] subtractMatrices(int[][] mat1, int[][] mat2, int m, int n) {
        int[][] res = new int[m][n];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                res[row][col] = mat1[row][col] - mat2[row][col];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{3, 2, 5}, {2, 7, 5}, {4, 6, 1}};
        int[][] mat2 = {{1, 6, 2}, {4, 1, 2}, {2, 4, 1}};

        System.out.println("Matrix 1: ");
        printMatrix(mat1, 3, 3);
        System.out.println("Matrix 2: ");
        printMatrix(mat2, 3, 3);

        int num = 7;
        if (searchMatrix(mat1, 3, 3, 7)) {
            System.out.println("Element Found.");
        } else {
            System.out.println("Not Found.");
        }

        int[][] sum = addMatrices(mat1, mat2, 3, 3);
        System.out.println("Addition of Matrices: ");
        printMatrix(sum, 3, 3);

        int[][] sub = subtractMatrices(mat1, mat2, 3, 3);
        System.out.println("Subtraction of Matrices: ");
        printMatrix(sub, 3, 3);

    }
}
