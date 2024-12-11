package algorithm;

// https://leetcode.com/problems/matrix-diagonal-sum/
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {999}
        };
        int[][] matrix3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix4 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println("Sum of the diagonals: " + diagonalSum(matrix));
        System.out.println("Sum of the diagonals: " + diagonalSum(matrix3));
        System.out.println("Sum of the diagonals: " + diagonalSum(matrix4));
    }

    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            sum += matrix[i][n - i - 1];
        }

        if (n % 2 != 0) {
            sum -= matrix[n / 2][n / 2];
        }

        return sum;
    }
}