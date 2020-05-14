package LeetcodeMAYchallenge;
//Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
//Output: true
public class Leetcodemay08 {

	 public boolean checkStraightLine(int[][] points) {
	        if(points.length<=2)
	            return true;
	        float m= (float)(points[1][1]-points[0][1])/(points[1][0]-points[0][0]);
	      //  System.out.println(m);
	        for(int i=1;i<points.length;i++)
	        {
	            float nslp=(float)(points[i][1]-points[0][1])/(points[i][0]-points[0][0]);
	           // System.out.println(nslp);
	            if(nslp!=m)
	                return false;
	                    
	        }
	    return true;
	    }
}
