
public class Jumpgame1 {
	
	    public boolean canJump(int[] nums) {
	        int lastPos = nums.length - 1;
	        for (int i = lastPos-1; i >= 0; i--) {
	            if (i + nums[i] >= lastPos) {
	                lastPos = i;
	            }
	        }
	        return lastPos == 0;
	    }
	}

	

