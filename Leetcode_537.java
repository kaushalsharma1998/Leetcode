
public class Leetcode_537 {

	public static void merge(int p1, int p2, int par[], int size[]) {
		if (size[p1] < size[p2]) {
			par[p1] = par[p2];
			size[p2] += size[p1];
		} else {
			par[p2] = par[p1];
			size[p1] += size[p2];
		}
	}

	public  int findParent(int vtx, int par[]) {
		if (par[vtx] == vtx)
			return vtx;
		par[vtx] = findParent(par[vtx], par);
		return par[vtx];
	}

public int findCircleNum(int[][] arr) {
    int n=arr.length;
    int par[]=new int[n];
    for(int i=0;i<n;i++)
    	par[i]=i;
    int count=n;
	for(int i =0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(arr[i][j]!=0&&i!=j)
			{
				int p1=findParent(i, par);
				int p2= findParent(j, par);
				if(p1!=p2)
					par[p1]=p2;
				count--;
			}
		}
	}
    return count;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
