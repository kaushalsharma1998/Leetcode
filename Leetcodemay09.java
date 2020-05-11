//same as is valid square:
public class Leetcodemay09 {

	 public boolean isPerfectSquare(int num) {
	        if(num==1)
	            return true;
	        if(num<1)
	            return false;
	        long sp=1,ep=num;
	        long multi=0;
	        while(sp<=ep)
	        {  long mid= sp-sp/2+ep/2;
	            multi=mid*mid;
	            
	            if(multi==num)
	            return true;
	         
	            else if(multi<num)
	                sp=mid+1;
	            else 
	                ep=mid-1;
	        }   
	    return false;
	    }
}
