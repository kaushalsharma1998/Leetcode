package LeetcodeMAYchallenge;

import java.util.Arrays;

public class Leetcodemay21 {
int count=0;
	public int countSquares(int[][] matrix) {
        
	int[][] dp=new int [matrix.length][matrix[0].length];
	for(int i=0;i<dp.length;i++)
	Arrays.fill(dp[i], -1);
	 sub1s(matrix, 0, 0, dp); 
	 return  count;	
}
public  int sub1s(int arr[][], int x, int y, int dp[][]) {
	if (x == arr.length - 1 || y == arr[0].length - 1) {
		{
			return arr[x][y];
		}
	}
	//if (dp[x][y] != -1)
		//return arr[x][y];
	//int ans = 0;
	int right = sub1s(arr, x, y + 1, dp);
	int down = sub1s(arr, x + 1, y, dp);
	int diag = sub1s(arr, x + 1, y + 1, dp);
	count=right+down+diag;
	if (arr[x][y] == 1) {
	//int	ans = Math.min(Math.min(down, right), diag) + 1;
   if(Math.min(Math.min(down, right), diag)>0)
	   count+=2;
   else count++;
		
	}

	return arr[x][y];

}

public int countSquarescoped(int[][] matrix) {
    int mat[][] = new int[matrix.length + 1][matrix[0].length + 1];
    int sum = 0;
    
    /*  We can do Dynamic Programming by saving how many
        Squares can be formed using the bottom right corner
        element.
    */
    
    for(int i = 1; i <= matrix.length; i++)
        for(int j = 1; j <= matrix[0].length; j++)
            if(matrix[i - 1][j - 1] != 0)
                sum += (mat[i][j] = Math.min(Math.min(mat[i - 1][j], mat[i][j - 1]), mat[i - 1][j - 1]) + 1);
    
return sum;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(new Leetcodemay21().countSquares(new int[][] {{0,1,1,1},
																 {1,1,1,1},
																 {0,1,1,1}}));
	}

}
