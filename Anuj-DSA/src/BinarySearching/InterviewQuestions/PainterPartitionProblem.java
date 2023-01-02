package BinarySearching.InterviewQuestions;

public class PainterPartitionProblem {

	static int allocatePaint(int[] arr, int n, int m) {
		int start = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}

		int end = sum;
		int mid = start + (end - start) / 2;
		int ans = -1;

		while (start <= end) {
			if (isPossible(arr, n, m, mid)) {
				ans = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			mid = start + (end - start) / 2;
		}

		return ans;

	}

	static boolean isPossible(int[] arr, int n, int m, int mid) {
		int painterCount = 1;
		int paintSum = 0;

		for (int i = 0; i < n; i++) {
			if (paintSum + arr[i] <= mid) {
				paintSum += arr[i];
			} else {
				painterCount++;
				if (painterCount > m || arr[i] > mid) {
					return false;
				}
				paintSum = arr[i];
			}
			if (painterCount > m) {
				return false;
			}
			// cout << " for i " << i << " Student "<< studentCount << " pageSum " <<
			// pageSum << endl;
		}
		return true;
	}

	public static void main(String[] args) {
//		n-> no. of paint
//		m-> no. of painters
		int n = 4;
		int m = 2;
		int[] arr = { 5, 5, 5, 5 }; // all paint stored in an array

		int result = allocatePaint(arr, n, m);
		System.out.println("Allocate minimum number of paints to painter: " + result);

	}

}
