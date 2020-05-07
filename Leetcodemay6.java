import java.util.HashMap;

//Example 1:
//
//Input: [3,2,3]
//Output: 3
//Example 2:
//
//Input: [2,2,1,1,1,2,2]
//Output: 2

public class Leetcodemay6 {
	public int majorityElement(int[] nums) {
	     HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
	     
	for(int i=0;i<nums.length;i++)
	{
		map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
	}
	int ans=0;
	for( int a:map.keySet())
	{
		if(map.get(a)>nums.length/2)
			{ ans=a;
			break;}
	}
	return ans;
	}
	public static void main(String args[])
	{
		Leetcodemay6 lc=  new Leetcodemay6();
		System.out.println(lc.majorityElement(new int[]{-1,2,2,3,2}));
	}
}
