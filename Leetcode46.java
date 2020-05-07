import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class Leetcode46 {
public List<List<Integer>>ans=new  ArrayList<List<Integer>>();
	
	public List<List<Integer>> permute(int[] nums) {
		 helper(nums,0,new boolean[nums.length],new ArrayList<Integer>());
		 return  ans;   
	    }
	private void helper(int[] arr, int idx,boolean vis[], ArrayList<Integer>recans) {
		if(recans.size()==arr.length)
		{	ans.add(new ArrayList<Integer>(recans));
			return;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(!vis[i])
			{	vis[i]=true;
				recans.add(arr[i]);
				helper(arr,i+1,vis,recans);
				recans.remove(recans.size()-1);
				vis[i]=false;
			}
			
			}
	}
	 private void swap(int[] nums, int left, int right) {
	        int temp = nums[left];
	        nums[left] = nums[right];
	        nums[right] = temp;
	    }
public static void  main(String args[])
{    Leetcode46 lc= new Leetcode46();
 System.out.println(lc.permute(new int[]{1,2,3}));
	}
}
