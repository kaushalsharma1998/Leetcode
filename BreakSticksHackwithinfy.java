import java.io.*;
import java.util.*;
import java.lang.Math;

public class BreakSticksHackwithinfy {

	public static int breakSticks(int[] arr, int M, int desiredLength) {
		int ans = 0;
		List<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % desiredLength == 0 && arr[i] != 3)
				l.add(arr[i]);
			if (arr[i] == desiredLength)
				ans++;

		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % desiredLength != 0)
				l.add(arr[i]);

		}
		System.out.println(l);
		System.out.println(ans);
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) % desiredLength == 0) {
				int x = l.get(i) / desiredLength;
				if (M >= x - 1) {
					ans += x;
					M = M - (x - 1);
				} else {
					M = 0;
					ans = ans + M;
				}

			} else {
				int x = l.get(i) / desiredLength;
				if (M >= x) {
					ans += x;
					M = M - x;
				} else {
					M = 0;
					ans = ans + M;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int N=0;
//		N = scan.nextInt();
//		int[] A = new int[N];
//		for (int j = 0; j < N; j++) {
//			A[j] = scan.nextInt();
//		}
//		int M;
//		M = scan.nextInt();
//		int desiredLength;
//		desiredLength = scan.nextInt();
		int result;
		result = breakSticks(new int[] { 9, 6, 12, 10, 3 }, 6, 3);
		System.out.print(result);
		return;
	}
}
