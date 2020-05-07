import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Leetcode216 {
	public List<List<Integer>>ans=new ArrayList<List<Integer>>();
	public List<List<Integer>> combinationSum3(int k, int n) {
		helper(k , n ,1, new ArrayList<Integer>());
		return ans;
	}
public void helper(int k ,int target,int idx,  ArrayList<Integer>recans)
{	if(target==0&&recans.size()==3)
	{
	 ans.add(new ArrayList<Integer>(recans));
	  return;
	}
	for(int i=idx;i<=target;i++)
		if(target-i>=0)
		{	recans.add(i);
			helper(k, target-i, idx+1, recans);
			recans.remove(recans.size()-1);
		}
}
}
