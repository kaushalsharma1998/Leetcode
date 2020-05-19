package Arrays;

//Sieve of whatever 
public class Leetcode204 {

	public int countPrimes(int n) {
	     boolean isnotprime[]=new boolean[n];
	     int count=0;
	     for(int i=2;i*i<n;i++ ) {
	    	 if(!isnotprime[i])
	    	 { for(int j=i*i;j<n;j+=i)
	    	 {
	    		 isnotprime[j]=true;
	    	 }
	    }
	    	 }
	     for(int i = 2 ; i < isnotprime.length; i++){
	            if(!isnotprime[i]) count++;
	        } 
	     return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
