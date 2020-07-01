class 	Leetcodejune29 {
    int M,N;
    int dp[][];
    public int uniquePaths(int m, int n) {
        this.dp= new int [m][n];
        this.M=m;
        this.N=n;
        return helper(0,0);
    }
    public int helper(int i, int j)
    {
        if(i==M-1&&j==N-1)
        {
            return dp[i][j]=1;
        }
        if(dp[i][j]!=0)
            return dp[i][j];
        int count=0;
        if(i+1<M)
            count+=helper(i+1,j);
        if(j+1<N)
            count+=helper(i,j+1);
         
        return dp[i][j]=count;
            
            
    }
  
}