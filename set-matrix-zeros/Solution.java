// Set Matrix Zeros
// Leetcode problem #73
// https://leetcode.com/problems/set-matrix-zeroes/

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean first_row_zero = false, first_column_zero = false;
        for (int x: matrix[0])
            if (x == 0) {
                first_row_zero = true;
                break;
            }

        for (int[] y: matrix)
            if (y[0] == 0) {
                first_column_zero = true;
                break;
            }

        for (int y = 0; y < matrix.length; y++)
            for (int x = 0; x < matrix[y].length; x++) {
                if (matrix[y][x] == 0) {
                    matrix[0][x] = 0;
                    matrix[y][0] = 0;
                }
            }

        for (int x = 1; x < matrix[0].length; x++)
            if (matrix[0][x] == 0)
                for (int y = 1; y < matrix.length; y++)
                    matrix[y][x] = 0;

        for (int y = 1; y < matrix.length; y++)
            if (matrix[y][0] == 0)
                for (int x = 1; x < matrix[y].length; x++)
                    matrix[y][x] = 0;

        if (first_row_zero)
            for (int x = 0; x < matrix[0].length; x++)
                matrix[0][x] = 0;

        if (first_column_zero)
            for (int y = 0; y < matrix.length; y++)
                matrix[y][0] = 0;
    }
}
