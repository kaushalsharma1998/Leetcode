package LeetcodeMAYchallenge;

public class Leetcodemay01 {
	  public int firstBadVersion(int n) {
		     long l=1,h=n;
		        while(l<=h)
		        {
		        long mid=(l+h)/2;
		            if(isBadVersion((int)mid)==true)
		                h=mid-1;
		            if(isBadVersion((int)mid)==false)
		                l=mid+1;    
		        }
		        
		    return (int)l;
		    }

	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		//Already edefined API
		
		return false;
	}
}
