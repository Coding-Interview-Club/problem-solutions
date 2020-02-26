class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    if(j==grid[i].length-1){
                        perimeter++;//perimeter to the bottom
                    }
                    
                        if((j+1)<grid[i].length&&grid[i][j+1]==0){
                            perimeter++;
                        }
                        if(j==0){
                            perimeter++;
                        }
                    
                    if(i==grid.length-1){
                        perimeter++;//perimeter to the left
                    }
                    
                        if((i+1)<grid.length&&grid[i+1][j]==0){
                            perimeter++;
                        }
                        if(i==0){
                            perimeter++;
                        }
                    
                }
                else{
                    if(j!=(grid[i].length-1)&&grid[i][j+1]==1){
                        perimeter++;
                    }
                    if(i!=(grid.length-1)&&grid[i+1][j]==1){
                        perimeter++;
                    }
                }
            }
        }
        return perimeter;
    }
}
