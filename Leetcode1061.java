
public class Leetcode1061 {
	public  int findParent(int vtx, int par[]) {
		if (par[vtx] == vtx)
			return vtx;
		par[vtx] = findParent(par[vtx], par);
		return par[vtx];
	}
	public String smallestEquivalentString(String A, String B, String S) {
		int par[]=new int [26];
		for(int i=0;i<26;i++)
			par[i]=i;
		for(int i=0;i<A.length();i++)
		{
			char u=A.charAt(i);
			char v=B.charAt(i);
			int p1=findParent(u-'a', par);
			int p2=findParent(v-'a', par);
//			if(p1!=p2)
//			{
//				if(u<v)
//					par[p2]=p1;
//				else 
//					par[p2]=p1;
//			}
			par[p1]= Math.min(p1, p2);
			par[p2]= Math.min(p1, p2);
		}
		String ans="";
		for(int i=0;i<S.length();i++)
		{
			ans+=(char)((findParent(S.charAt(i)-'a', par))+'a');
		}
	return ans;	
	}

public static void main(String args[] )
{ Leetcode1061 lc=new Leetcode1061();
//Input: A = "leetcode", B = "programs", S = "sourcecode"
//Output: "aauaaaaada"
	System.out.println(lc.smallestEquivalentString("leetcode","programs", "sourcecode" ));
	}
}