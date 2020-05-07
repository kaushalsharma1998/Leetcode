//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
//public class LC1 {
//
////	public int[] twoSum(int[] nums, int target) {
//		int[] ans = helper(nums, target);
//		if (ans[0] == (int) 1e8) {
//			System.out.println("");
//		} else
//			return ans;
//	}
//
//	public int[] helper(int arr[], int target) {
//		int i = 0, j = arr.length - 1;
//		Arrays.parallelSort(arr);
//		int ans[] = { (int) 1e8, (int) 1e8 };
//		while (i < j) {
//			if (arr[i] + arr[j] == target) {
//
//				ans[0] = i;
//				ans[1] = j;
//
//			} else if (arr[i] + arr[j] > target)
//				j--;
//			else
//				i++;
//
//		}
//		return ans;
//
//	}
////	//public int[] helper2(int arr[],int target)
////	{
////		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
////		for(int i=0;i<arr.length;i++)
////		{
////			Integer val=map.get(target-arr[i]);
////			if(val==null)
////				map.put(arr[i], i);
////			else return   new int[]{val,i};
////			
////		}
////		
////	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
