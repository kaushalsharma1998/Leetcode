package Arrays;

import java.util.Arrays;

public class Leetcode0659 {

	 public boolean isPossible(int[] nums) {
      HashMap<Integer,Integer>fmap=new HashMap<>();
      HashMap<Integer,Integer>hmap=new HashMap<>();
        for(int a:nums)
          fmap.put(a,fmap.getOrDefault(a,0)+1);
        for(int i:nums)
        {
            if(fmap.get(i)==0)continue;
            if(hmap.getOrDefault(i,0)>0)
            { hmap.put(i, hmap.getOrDefault(i,0)-1);
              hmap.put(i+1, hmap.getOrDefault(i+1,0)+1);
              fmap.put(i,fmap.getOrDefault(i,0)-1);
                            
            }
            else if(fmap.getOrDefault(i, 0) > 0 && fmap.getOrDefault(i+1, 0) > 0 && fmap.getOrDefault(i+2, 0) > 0){
                        fmap.put(i, fmap.get(i)-1);                    
                        fmap.put(i+1, fmap.get(i+1)-1);
                        fmap.put(i+2, fmap.get(i+2)-1);
                        hmap.put(i+3, hmap.getOrDefault(i+3,0)+1); 
        }
            else{
                return false;
            }
    }
return true;
    }
}
