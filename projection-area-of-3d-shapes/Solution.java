class Solution {
    public int projectionArea(int[][] grid) {
        int xy=0;
        int xz=0;
        int yz=0;
        int [] cols = new int [(grid[0].length)];
        int [] rows = new int [(grid[0].length)];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(cols[j]<grid[i][j]){
                    cols[j]=grid[i][j];
                }
                if(grid[i][j]>0){
                    xy++;
                }
                if(rows[i]<grid[i][j]){
                    rows[i]=grid[i][j];
                }
            }
        }
        for(int i=0;i<cols.length;i++){
            xz+=cols[i];
        }
        for(int i=0;i<rows.length;i++){
            yz+=rows[i];
        }
        return xy+xz+yz;
        
    }
}