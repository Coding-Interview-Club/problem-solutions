// Seach a 2D Matrix
// Leetcode Problem 74
// https://leetcode.com/problems/search-a-2d-matrix/ 

class Solution{
    // Maps a linear index to every value in the matrix. Returns item at
    // the linear index.
    public static int get(int[][] matrix, int linear_index){
        return matrix[linear_index/matrix[0].length][linear_index%matrix[0].length];
    }

    // Binary search implementation using get().
    public static boolean searchMatrix(int[][] matrix, int target){
        if(matrix.length == 0) return false;
        int left = 0, right = matrix.length * matrix[0].length - 1, current;
        while(left <= right){
            current = get(matrix, (right+left)/2);
            if(current == target) return true;
            if(current > target) right = (right+left)/2 - 1;
            else left = (right+left)/2 + 1;
        }
        return false;
    }
}
