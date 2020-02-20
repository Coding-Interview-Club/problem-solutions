class Solution {
    public void rotate(int[][] matrix) {
        int start=0;
        int end=matrix.length-1;
        int temp=0;
        while(start<=end){
            for(int i=0;start+i<end;i++){
                temp=matrix[end-i][start];
                matrix[end-i][start]=matrix[end][end-i];
                matrix[end][end-i]=matrix[start+i][end];
                matrix[start+i][end]=matrix[start][start+i];
                matrix[start][start+i]=temp;
            }
            start++;
            end--;
        }
    }
}