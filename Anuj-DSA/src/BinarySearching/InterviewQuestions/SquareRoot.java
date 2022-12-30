package BinarySearching.InterviewQuestions;

public class SquareRoot {

	public static long binarySearch(int n) {
		long start = 0;
		long end = n;
		long mid = start + (end - start) / 2;
		long ans = -1;

		while (start <= end) {
			long square = mid * mid;

			if (square == n) {
				return mid;
			}
			if (square < n) {
				ans = mid;
				start = mid + 1;
			} else {

				end = mid - 1;
			}

			mid = start + (end - start) / 2;
		}

		return ans;
	}

	public static int mySqrt(int x) {

		long ans = binarySearch(x);
		return (int) ans;

	}

	public static void main(String[] args) {
		int n = 36;

		int ans = mySqrt(n);
		System.out.println("Square root of " + n + " is: " + ans);
	}

}
