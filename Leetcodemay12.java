//Example 1:
//
//Input: [1,1,2,2,3,3,4,4,8,8]
//Output: 2
//Example 2:
//
//Input: [3,3,7,7,10,11,11]
//Output: 10
public class Leetcodemay12 {

	 public static int singleNonDuplicate(int[] arr) {
		 if(arr.length==1)
			 return arr[1];
		int slow=0;
		int fast=1;
		while(fast<=arr.length-1)
		{
			if(arr[slow]!=arr[fast])
				break;
		
			slow=fast+1;
		 fast+=2;
		}
	        return arr[slow];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(singleNonDuplicate(new int[] {3,3,7,7,10,11,11}));
	}

}
