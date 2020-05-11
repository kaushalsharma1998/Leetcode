import java.util.HashMap;

public class Leetcodemay02 {

	public int numJewelsInStones(String jwl, String stn) {
		   HashMap<Character,Integer>map=new HashMap<>();   
		   for(int i=0;i<jwl.length();i++)
		   {
			   map.put(jwl.charAt(i), i);
		   }
		   int count=0;
		        for( int i=0;i<stn.length();i++)
		    {       
		        if(map.containsKey(stn.charAt(i)))
		        count++;
		    }
		    return count;
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Leetcodemay02 mc=new Leetcodemay02();
 System.out.println(mc.numJewelsInStones("aA", "aAAB"));
	}

}
