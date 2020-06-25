package Arrays;

class Solution {
      public int surfaceArea(int[][] grid) {
        
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        int surfaceArea = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                
                if (grid[i][j] == 0) continue; // contributes nothing
                
                for (int[] dir : directions) { // for N, S, E, W find all positive exposed side differences and append to our SA
                    int newX = i + dir[0], newY = j + dir[1];
                    if (newX < 0 || newX >= grid.length || newY < 0 || newY >= grid[0].length) surfaceArea += grid[i][j];
                    else if (grid[i][j] > grid[newX][newY]) surfaceArea += grid[i][j] - grid[newX][newY];
                }
                surfaceArea += 2; // top and bottom
            }
        }
        
        return surfaceArea;
    }}