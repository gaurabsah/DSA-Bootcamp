package BinarySearching.InterviewQuestions;

import java.util.Arrays;

public class AggressiveCows {

	static int aggressiveCows(int[] stalls, int k) {

		Arrays.sort(stalls);

		int s = 0;
		int n = stalls.length;
		int e = stalls[n - 1];
		int ans = -1;
		int mid = s + (e - s) / 2;

		while (s <= e) {
			if (isPossible(stalls, k, mid, n)) {
				ans = mid;
				s = mid + 1;
			} else {
				e = mid - 1;
			}
			mid = s + (e - s) / 2;
		}
		return ans;
	}

	static boolean isPossible(int[] stalls, int k, int mid, int n) {

		int cowCount = 1;
		int lastPos = stalls[0];

		for (int i = 0; i < n; i++) {

			if (stalls[i] - lastPos >= mid) {
				cowCount++;
				if (cowCount == k) {
					return true;
				}
				lastPos = stalls[i];
			}
		}
		return false;
	}

	public static void main(String args[]) {
		int cows = 2;
		int a[] = { 4, 2, 1, 3, 6 };

		System.out.println("The largest minimum distance is " + aggressiveCows(a, cows));

	}
}
