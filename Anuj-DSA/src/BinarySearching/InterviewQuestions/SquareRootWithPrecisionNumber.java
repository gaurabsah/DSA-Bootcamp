package BinarySearching.InterviewQuestions;

public class SquareRootWithPrecisionNumber {

	public static long binarySearch(long n) {
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

	public static long mySqrt(long x) {

		long ans = binarySearch(x);
		return ans;

	}

	static double morePrecision(long n, int precision, long tempSol) {

		double factor = 1;
		double ans = tempSol;

		for (int i = 0; i < precision; i++) {
			factor = factor / 10;

			for (double j = ans; j * j < n; j = j + factor) {
				ans = j;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		long n = 10000000;

		long tempSol = mySqrt(n);
		System.out.println("Square root of " + n + " is: " + morePrecision(n, 3, tempSol));
	}

}
