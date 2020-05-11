//is town_king
//Input: N = 3, trust = [[1,3],[2,3],[3,1]]
//Output: -1
public class Leetcodemay10 {

	public int findJudge(int N, int[][] trust) {
        boolean trustsOther[]=new boolean[N+1];
  if(N==1)
      return 1;
       for(int i=0;i<trust.length;i++)
   
   {
       trustsOther[trust[i][0]]=true;
   }
       int judge=0;
       for( int i=1;i<=N;i++)
       {
           if(trustsOther[i]==false)
           { judge=i;
           break;}
       }
       if(judge==0)
           return -1;
       int count=0;
       for(int i=0;i<trust.length;i++)
       {
           if(trust[i][1]==judge)
           {
               count++;
               if(count>=N-1)
                   return judge;
           }
       }
   return -1;
   }

}
