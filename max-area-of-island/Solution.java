class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area=0;
        int shape=0;
        int [] point = new int[2];
        boolean [][] visited = new boolean[grid.length][grid[0].length];
        LinkedList<int[]> island = new LinkedList<int[]>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visited[i][j]){
                    visited[i][j]=true;
                if(grid[i][j]==1){
                    visited[i][j]=true;
                    island.add(new int []{i,j});
                    while(island.size()>0){
                        shape++;
                        point=island.pop();
                        if((point[0]-1)>=0&&grid[point[0]-1][point[1]]==1&&!visited[point[0]-1][point[1]]){
                            island.add(new int []{point[0]-1,point[1]});
                            visited[point[0]-1][point[1]]=true;
                        }
                        if((point[0]+1)<(grid.length)&&grid[point[0]+1][point[1]]==1&&!visited[point[0]+1][point[1]]){
                            island.add(new int []{point[0]+1,point[1]});
                            visited[point[0]+1][point[1]]=true;
                        }
                        if((point[1]-1)>=0&&grid[point[0]][point[1]-1]==1&&!visited[point[0]][point[1]-1]){
                            island.add(new int []{point[0],point[1]-1});
                            visited[point[0]][point[1]-1]=true;
                        }
                        if((point[1]+1)<(grid[0].length)&&grid[point[0]][point[1]+1]==1&&!visited[point[0]][point[1]+1]){
                            island.add(new int []{point[0],point[1]+1});
                            visited[point[0]][point[1]+1]=true;
                        }
                    }
                    if(shape>area){
                        area=shape;
                    }
                    shape=0;
                }
                }
            }
        }
        return area;
    }
}
