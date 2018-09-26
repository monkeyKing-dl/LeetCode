/**
 * Created by daili on 2018/9/23.
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if(grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        int m = grid.length;
        int n= grid[0].length;
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid,int m,int n){
        if(m < 0 || n< 0 || m>= grid.length || n>=grid[0].length || grid[m][n] == '0'){
            return;
        }
        grid[m][n] = '0';
        dfs(grid,m-1,n);
        dfs(grid,m+1,n);
        dfs(grid,m,n-1);
        dfs(grid,m,n+1);
    }
}
