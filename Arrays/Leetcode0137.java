class 	Leetcodejune22 {
     public int singleNumber(int[]arr) {
     HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int a:arr)
            map.put(a,map.getOrDefault(a,0)+1);
        for( int a:map.keySet())
        {
            if(map.get(a)<3)
                return a;
        }
              return 0;
    }}