package LeetcodeMAYchallenge;

import java.util.ArrayList;
import java.util.List;

public class Leetcodemay23 {

	public int[][] intervalIntersection(int[][] A, int[][] B) {
        int p = 0;
        int q = 0;
        List<int[]> res = new ArrayList<>();
        while (p < A.length && q < B.length) {
            int maxStart = Math.max(A[p][0], B[q][0]);
            int minEnd = Math.min(A[p][1], B[q][1]);
            
            if (maxStart <= minEnd) { // overlap exists
                res.add(new int[]{maxStart, minEnd});
            }
            
            if (A[p][1] < B[q][1]) {
                ++p;
            } else if (A[p][1] > B[q][1]) {
                ++q;
            } else {
                ++p; ++q;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
