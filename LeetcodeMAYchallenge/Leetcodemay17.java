package LeetcodeMAYchallenge;
import java.util.ArrayList;
import java.util.List;

//Input:
//s: "cbaebabacd" p: "abc"
//
//Output:
//[0, 6]
//
//Explanation:
//The substring with start index = 0 is "cba", which is an anagram of "abc".
//The substring with start index = 6 is "bac", which is an anagram of "abc".
public class Leetcodemay17 {
	public List<Integer> findAnagrams(String s, String p) {
        int[] pa = new int[26];
        for(int i = 0; i < p.length(); i++) {
            pa[p.charAt(i) - 'a']++;
        }
        int j = 0;
        int rem = p.length();
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < s.length(); i++) {
            while(j < s.length() && j - i < p.length()) {
                if(pa[s.charAt(j++) - 'a']-- > 0) {
                    rem--;
                }
            }
            if(rem == 0 && j - i == p.length()) result.add(i);
            if(pa[s.charAt(i) - 'a']++ >= 0) rem++;
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
