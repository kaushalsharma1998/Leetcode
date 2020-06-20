package Mockvita;


import java.util.HashMap;
import java.util.Scanner;

public class Collision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner sc= new Scanner(System.in);
	 
	 
	 int cars=sc.nextInt();
	 HashMap<Double, Integer>map=new HashMap<Double, Integer>();
	 
	 for(int i=0;i<cars;i++)
	 {
		 int x=sc.nextInt();
		 int y=sc.nextInt();
		 int v=sc.nextInt();
		    
		 double dis=Math.sqrt(x*x+y*y);
		 double t= dis/v;
		 //System.out.println(t);
		 map.put(t, map.getOrDefault(t, 0)+1);
		 
	 }
	 int count =0;
	 for(double a : map.keySet())                  


	 {
		int c= map.get(a);
		//System.out.println( a+" "+ c);
		if(c>1)
		{	count=count+(c*(c-1)/2);
		//System.out.println(count +" "+ c*(c-1)/2) ;
		}	
			
	 }
	 
	 System.out.println(count);
	 
		
	
	}
}
