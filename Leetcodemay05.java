import java.util.ArrayList;

//s = "leetcode"
//return 0.
//
//s = "loveleetcode",
//return 2.
public class Leetcodemay05 {

	public int firstUniqChar(String s) {
		int map[]= new int[26];
		for(int i=0;i<s.length();i++)
		{
			map[s.charAt(i)-'a']++;
		}
		int arr[]=new int[s.length()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=map[s.charAt(i)-'a'];
		}
		for(int i=0;i<s.length();i++)
		{
			if(arr[i]==1)
				return i;
		}
		return -1;
	 }
	public static void main(String args[])
	{
		Leetcodemay05 lc=  new Leetcodemay05();
		System.out.println(lc.firstUniqChar("lleetcode"));
	}
}