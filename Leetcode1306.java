
public class Leetcode1306 {
//	Input: arr = [4,2,3,0,3,1,2], start = 5
//			Output: true


	    public boolean canReach(int[] arr, int start) {
	       
	        return helper(arr, start ,new boolean[arr.length]);
	    }
	     public boolean helper(int arr[], int start, boolean vis[])
	    {
	       
	        if(arr[start]==0)
	        	return true;
	        
	        boolean res=false;
	        // vis[start] = true;
	        if(start-arr[start]>=0&&vis[start-arr[start]]==false)
	        { 
	            res=res||helper(arr, start-arr[start],vis);
	        }    
	         if(start+arr[start]<arr.length&&!vis[start+arr[start]])
	         { 
	             res=res||helper(arr, start+arr[start],vis);
	         }
	          return res;
	    }
	}

