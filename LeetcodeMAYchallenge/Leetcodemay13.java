package LeetcodeMAYchallenge;
//Example 1:
//
//Input: num = "1432219", k = 3
//Output: "1219"
//Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
//Example 2:
//
//Input: num = "10200", k = 1
//Output: "200"

import java.util.Stack;

public class Leetcodemay13 {

	public String removeKdigits(String str, int k) {
		if (str.length() == k)
			return "0";
		Stack<Character> st = new Stack<Character>();
		int i = 0;
		while (i < str.length()) {
			while (k > 0 && !st.isEmpty() && st.peek() > str.charAt(i)) {
				st.pop();
				k--;
			}

			st.push(str.charAt(i));
			i++;

		}
		while (k > 0)
		{	st.pop();k--;}
		StringBuilder sb = new StringBuilder();
		while (!st.empty()) {
			char ch = st.pop();
			sb.append(ch);
		}
		sb.reverse();
		while (sb.length() > 1 && sb.charAt(0) == '0')
			sb.deleteCharAt(0);
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
