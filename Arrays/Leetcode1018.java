package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1018 {
public  static List<Boolean> prefixesDivBy5(int[] arr) {
     int start=arr[0];
     List<Boolean>ans=new ArrayList<>();
     if(start%5==0)
    	 ans.add(true);
     else ans.add(false);
    
     for(int i=1;i<arr.length;i++)
     {
    	 start=start*2+arr[i];
    	if(start%5==0)
    	ans.add(true);
    	else 
    		ans.add(false);
    	start=start%5; //to save from going out of max integer value;
     }
    
     return ans;
	
    }
public static void main(String args[])
{
	System.out.println(prefixesDivBy5(new int [] {1,0,1,0}));
	}
}
