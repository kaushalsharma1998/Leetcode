class Leetcode0392{
//does t conatin s subsequence 
//iterate over s and t and every time there is a mismatch update  t pointer else update both in last check the length of string and s //pointer      
public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
//recursive

public boolean isSubsequence(String s, String t, int i, int j) {
        if(i == s.length()) return true;
        if(j == t.length()) return false;
        return s.charAt(i) == t.charAt(j) ? isSubsequence(s, t, i + 1, j + 1) : isSubsequence(s, t, i, j + 1);
    }
}