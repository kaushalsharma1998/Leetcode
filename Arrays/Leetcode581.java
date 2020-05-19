package Arrays;

public class Leetcode581 {

public int findUnsortedSubarray(int[] arr) {
    if(arr.length<2)
    	return 0;
	int i=0,j=arr.length-1;
		for(  i=0;i<arr.length-1;i++)
	{
		if(arr[i]>arr[i+1])
		{
			break;
		}
	}
	for(  j=arr.length-1;j>0;j--)
	{
		if(arr[j-1]>arr[j])
		{
			break;
		}
	}
	System.out.println(arr[i]+ " " +arr[j]);
	if(j<i)
		return 0;
	
	while(j<arr.length-1&&arr[j]==arr[j+1])j++;
	while(i>0&&arr[i]==arr[i-1])i--;
	return (j<i)?0:j-i+1;  
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Leetcode581 lc=new Leetcode581();
System.out.println(lc.findUnsortedSubarray(new int [] {1,2,4,5,3}));
	}

}
