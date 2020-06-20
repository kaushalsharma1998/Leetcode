package Mockvita;

import java.util.Scanner;



public class Philalandcoin {
	
	public void   helper(int n)
	{
		int ans=0;
		while(n!=0)
		{
			ans=ans+1;
			n=n/2;
		}
		System.out.println(ans);
	}
	   
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int testcases=0;
		Scanner sc=new Scanner (System.in);
		testcases=sc.nextInt();
		while(testcases!=0)
		{
			int n=sc.nextInt();
			new Philalandcoin().helper(n);
			testcases--;
		}
		sc.close();
				
	}

}
