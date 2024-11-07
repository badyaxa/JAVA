package algorithm;

public class ZigzagMatrixIterator {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        iterateMatrix(matrix);
    }

    private static void iterateMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                iterateRow(matrix[i]);
            } else {
                iterateRowReverse(matrix[i]);
            }
        }

    }

    private static void iterateRow(int[] row) {
        for (int i : row) {
            System.out.print(i + " ");
        }
    }

    private static void iterateRowReverse(int[] row) {
        for (int i = row.length - 1; i >= 0; i--) {
            System.out.print(row[i] + " ");
        }
    }

}
