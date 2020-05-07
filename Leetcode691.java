import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Leetcode691 {

//	Input: [4, 6, 7, 7]
//			Output: [[4, 6], [4, 7], [4, 6, 7], [4, 6, 7, 7], [6, 7], [6, 7, 7], [7,7], [4,7,7]]
	public HashSet<List<Integer>> ans = new HashSet<List<Integer>>();

	public List<List<Integer>> findSubsequences(int[] nums) {
		helper(nums, 0, new ArrayList<Integer>());
		return new ArrayList<List<Integer>>(ans);
	}

	public void helper(int arr[], int idx, ArrayList<Integer> recans) {
		if (recans.size() >= 2) {
			
			  
			ans.add(new ArrayList<Integer>(recans));
			 }
			
		
		
		for (int i = idx; i < arr.length; i++) { 
			if((recans.size()==0||recans.get(recans.size()-1)<=arr[i])) {
			recans.add(arr[i]);
			helper(arr, i+1, recans);	
			recans.remove(recans.size()-1);
		}
		}
	}

	public static void main(String args[]) {
		Leetcode691 lc = new Leetcode691();
		System.out.println(lc.findSubsequences(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }));
	}
}
