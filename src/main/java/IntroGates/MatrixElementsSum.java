package IntroGates;

public class MatrixElementsSum {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1, 2},
                          {0, 5, 0, 0},
                          {2, 0, 3, 3}};
        System.out.println(matrixElementSum(matrix));
    }
    public static int matrixElementSum(int[][]matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = i + 1; k < matrix.length; k++) {
                        matrix[k][j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
        }

        return sum;
    }
}
