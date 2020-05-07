import java.util.ArrayList;
import java.util.List;

public class Leetcode39 {

	public List<List<Integer>>ans=new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     
         helper(candidates,0,target ,new ArrayList<Integer>());
     
     return ans;    

    }
    public List<Integer> helper(int arr[],int  vidx,int target ,ArrayList<Integer> rec)
    {
        if(target==0)
        {
            ans.add(new ArrayList<Integer>(rec));
            return rec;
        }
    for(int i=vidx;i<=arr.length;i++)
    {   if(target-arr[i]>=0)
    {  rec.add(arr[i]);
        helper(arr,i,target-arr[i],rec);
        rec.remove(rec.size()-1);
    }     
    }
    return rec;
    }
}
