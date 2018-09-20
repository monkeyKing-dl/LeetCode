/**
 * Created by daili on 2018/9/19.
 */
public class MinimumPathSum_64 {


//    [1,3,1],
//     [1,5,1],
//      [4,2,1]
    public int solution(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i == 0 && j == 0){
                    grid[i][j] = grid[i][j];
                }else if(i == 0 && j!=0){
                    grid[i][j] = grid[i][j-1] + grid[i][j];
                }else if(i !=0 && j == 0){
                    grid[i][j] = grid[i-1][j]+grid[i][j];
                }else if(i!=0 && j!=0){
                    grid[i][j] = Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
                }
            }
        }
        return grid[m-1][n-1];
    }
}
