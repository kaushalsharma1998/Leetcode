package LeetcodeMAYchallenge;

import java.util.HashMap;
import java.util.PriorityQueue;

//Given a string, sort it in decreasing order based on the frequency of characters.
//
//Example 1:
//
//Input:
//"tree"
//
//Output:
//"eert"
//
//Explanation:
//'e' appears twice while 'r' and 't' both appear once.
//So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
public class Leetcodemay22 {

	public String frequencySort(String s) {
        if(s == null || s.length() == 0) return s;
        
        int[] cnt_arr = new int[256];
        for(char c : s.toCharArray()){
            cnt_arr[c]++;
        }
        
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> cnt_arr[b] - cnt_arr[a]);
        for(int i = 0; i < 256; i++){
            pq.offer((char)i);
        }
        
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Character c = pq.poll();
            for(int i = 0; i < cnt_arr[c]; i++){
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
