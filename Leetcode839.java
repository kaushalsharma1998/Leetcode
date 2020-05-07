
public class Leetcode839 {
	public int findParent(int vtx, int par[]) {
		if (par[vtx] == vtx)
			return vtx;
		par[vtx] = findParent(par[vtx], par);
		return par[vtx];
	}

	public boolean isSimilar(String p, String q) {
		int count=0;
		for(int i=0;i<p.length();i++)
		{
			if(p.charAt(i)!=q.charAt(i)&&(++count)>2)
			return false;
		}
	return true;
	}

	public int numSimilarGroups(String[] A) {
		
		int n=A.length;
		int par[]=new int[n];
		for(int i=0;i<n;i++)
			par[i]=i;
		
		int group=n;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (isSimilar(A[i], A[j])) {
					int p1=findParent(i, par);
					int p2=findParent(j, par);
					if(p1!=p2)
					{
						par[p1]=p2;
						group--;
					}
				}
			}
		}
	return group;
	}
}
