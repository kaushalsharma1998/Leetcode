class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        
        int count=0;
        if(arr.length==1)
        { if(arr[0]!=1)
         
            count++;
         
         return count>=n;
        }  
        
        for(int i=0;i<arr.length;i++)
        
        { if(i-1>=0&&i+1<arr.length)
        
        {if(arr[i]!=1&&arr[i-1]!=1&&arr[i+1]!=1)
        
        { arr[i]=1;    
            count++;
        }
        }
         else if(i==0){
             if(arr[i+1]!=1&&arr[i]!=1)
             {  arr[i]=1; count++;
                System.out.println(n);
                }
         }
        else if(i==arr.length-1) 
            if(arr[i-1]!=1&&arr[i]!=1)
            {   arr[i]=1; count++;}
        
        }
        
        return count>=n;
    }
}