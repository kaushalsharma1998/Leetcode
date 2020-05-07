import java.io.*;
import java.util.*;

public class Warmine{

     public class Key{ 
    int x,y; 
   public  Key(int i,int j){ x=i;y=j;} 
} 
     int R;
     int C;
public Warmine(int R,int C)
{
	this.R=R;
	this.C=C;}
  
// These arrays are used to get row and column 
// numbers of 4 neighbours of a given cell 
public int rowNum[] = { -1, 0, 0, 1 };  
public int colNum[] = { 0, -1, 1, 0 }; 
  
boolean isValid(int x, int y)  
{  
    if (x < R && y < C && x >= 0 && y >= 0)  
        return true;  
  
    return false;  
}  
  
// A function to mark all adjacent cells of 
// landmines as unsafe. Landmines are shown with 
// number 0 
void findShortestPath(int mat[][]){ 
    int i,j; 
  
    for (i = 0; i < R; i++)  
    {  
        for (j = 0; j < C; j++)  
        {  
            // if a landmines is found 
            if (mat[i][j] == 0)  
            {  
            // mark all adjacent cells 
            for (int k = 0; k < 4; k++)  
                if (isValid(i + rowNum[k], j + colNum[k]))  
                    mat[i + rowNum[k]][j + colNum[k]] = -1;  
            }  
        }  
    }  
// mark all found adjacent cells as unsafe 
    for (i = 0; i < R; i++)  
    {  
        for (j = 0; j < C; j++)  
        {  
            if (mat[i][j] == -1)  
                mat[i][j] = 0;  
        }  
    }  
  
    int dist[][]=new int[R][C]; 
  
    for(i=0;i<R;i++){ 
        for(j=0;j<C;j++) 
            dist[i][j] = -1; 
    } 
    Queue<Key>q=new LinkedList<Key>();
  
    for(i=0;i<R;i++){ 
        if(mat[i][0] == 1){ 
            q.add( new Key(i,0)); 
            dist[i][0] = 0; 
        } 
    } 
  
    while(q.size()!=0){ 
        Key k = q.peek(); 
        q.remove(); 
  
        int d = dist[k.x][k.y]; 
  
        int x = k.x; 
        int y = k.y; 
  
        for (int k1 = 0; k1 < 4; k1++) { 
            int xp = x + rowNum[k1]; 
            int yp = y + colNum[k1]; 
            if(isValid(xp,yp) && dist[xp][yp] == -1 && mat[xp][yp] == 1){ 
                dist[xp][yp] = d+1; 
                q.add(new Key(xp,yp)); 
            } 
        } 
    } 
    
    int ans = (int)1e8; 
     
    for(i=0;i<R;i++){ 
        if(mat[i][C-1] == 1 && dist[i][C-1] != -1){ 
            ans = Math.min(ans,dist[i][C-1]); 
        } 
    } 
      
     
    if(ans == (int)1e8) 
     System.out.println("soldier:KIA"); 
          
    else 
        System.out.println(ans); 
} 
  
    

    
    
    
    public static void main(String[] args) {

      int mat[][] =  
    {  
        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },  
        { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },  
        { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 },  
        { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 },  
        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },  
        { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 },  
        { 1, 0, 1, 1, 1, 1, 1, 1, 0, 1 },  
        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },  
        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },  
        { 0, 1, 1, 1, 1, 0, 1, 1, 1, 1 },  
        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },  
        { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 }  
    };  
      
    Warmine c=new Warmine(12, 10);
    c.findShortestPath(mat); 
    }
    
}