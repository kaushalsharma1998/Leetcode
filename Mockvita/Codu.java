package Mockvita;

import java.util.Scanner;

public class Codu {

	public static  int factorial(int n,  int dp[])
	
	{ if(n==0||n==1)
		{
		return dp[n]=1;
		
		}
	if(dp[(int) n]!=0)
		return dp[n];
	int ans= n*factorial(n-1, dp);
	return dp[ n]=ans;
		
	}
	public   static int modIn(int b,  int   n) 
    { 
        b = (b % n); 
        for (int i = 1; i < n; i++) 
           if ((b * i) % n == 1) 
              return i; 
        return 1; 
    } 
	
	public  static void helper(int u,int n, int t)
	{ int dp[]=new int [(int)n+1];
		 
	 	int  utfact=factorial(u-t, dp);		 
    	int ntfact=factorial(n-t, dp);
     	int ufact= factorial(u, dp);
		int nfact=factorial(n, dp);	 
		 
		  
		 int ans= (ufact*ntfact)*modIn((nfact*utfact),1000000007);
		 System.out.println(ans%1000000007);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int testcases=0;
		Scanner sc=new Scanner (System.in);
		testcases=sc.nextInt();
		while(testcases!=0)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int t=sc.nextInt();
			int  u=n-m;
			 
			helper(u,n,t);
			
			testcases--;
		}
		sc.close();
		
		
	}

}
