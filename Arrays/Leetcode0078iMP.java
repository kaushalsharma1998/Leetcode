package Arrays;

import java.util.Arrays;

public class Leetcode0078 {

//SUBSEQUENCE 	
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new LinkedList<>();
        if(nums==null || nums.length ==0) return res;
        helper(res, new LinkedList<>(),nums, 0);
        return res;
    }
    private void helper(List<List<Integer>> res, List<Integer> track, int[] nums, int index){
        if(index == nums.length){//at the end of index, start output reslut
            res.add(new LinkedList<>(track));
            return;
        }
         //choose current number
        track.add(nums[index]);
        helper(res,track,nums,index+1);
        //unchoose current number: first remove from list, 
		//then do recursive from index+1 position, this means we skip current number
        track.remove(track.size()-1);
        helper(res,track,nums,index+1);
    }    

//NORMAL
public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        dfs(res, nums, new ArrayList<>(), 0);
        return res;
    }
    public void dfs(List<List<Integer>> res, int[] nums, List<Integer> l, int start){
        res.add(new ArrayList<>(l));
        for(int i = start; i < nums.length; i++){
            l.add(nums[i]);
            dfs(res, nums, l, i+1);
            l.remove(l.size()-1);
        }
    }

}
