package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class Leetcode349 {
	  public int[] intersection(int[] nums1, int[] nums2) {
	        HashMap<Integer, Boolean>map=new HashMap<Integer, Boolean>();
	ArrayList<Integer>ans=new ArrayList<Integer>();
	        for(int a: nums1)
		 {
			 map.put(a, false);
			 
		 }
		 for(int a:nums2)
		 {
		  if(map.containsKey(a))
		  {
			 ans.add(a);
			  map.remove(a);
		  }
			 
		 }
	   return ans.stream().mapToInt(i->i).toArray();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
