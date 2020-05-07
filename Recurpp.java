import java.io.*;
import java.util.*;

public class Recurpp {

    public static void main(String[] args) {
       // Scanner scn= new Scanner(System.in);
        int num=3;// scn.nextInt();
        generate(num);
    }

    static void generate(int depth) {
        recursiveGenerator(1, null, depth);
    }

    static void recursiveGenerator(int num, String prev, int limit) {
//        if(num==0){
//            return;
//        }
//        if(num==1){
//          System.out.print("1") ;
//          return;
//        }
    	
    	
        if (num <= limit) {
                    
        	if (prev != null&&num==limit) {
                System.out.println(prev+" "+num+" "+ prev);

            } 

        	prev = "";
                
            
            
            if (prev.equals("")) {
                prev += num + prev;
            } else {
                prev += " " + num + " " + prev+"";
            }
            recursiveGenerator(++num, prev, limit);
        
        }
    }
}