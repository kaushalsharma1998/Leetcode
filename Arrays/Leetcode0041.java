package Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
     
        HashSet<Integer>set=new HashSet<>();
            for(int a:nums)
            {
                set.add(a);
            }
        for(int i=1;i<=nums.length;i++)
        {
            if(!set.contains(i))
                return i;
        }
                return nums.length+1;
                
                
    }
}