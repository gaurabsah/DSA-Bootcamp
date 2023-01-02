package BinarySearching.InterviewQuestions;

public class BookAllocationProblem {

	static int allocateBooks(int[] arr, int n, int m) {
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
		int studentCount = 1;
		int pageSum = 0;

		for (int i = 0; i < n; i++) {
			if (pageSum + arr[i] <= mid) {
				pageSum += arr[i];
			} else {
				studentCount++;
				if (studentCount > m || arr[i] > mid) {
					return false;
				}
				pageSum = arr[i];
			}
			if (studentCount > m) {
				return false;
			}
			// cout << " for i " << i << " Student "<< studentCount << " pageSum " <<
			// pageSum << endl;
		}
		return true;
	}

	public static void main(String[] args) {
//		n-> no. of books
//		m-> no. of students
		int n = 4;
		int m = 2;
		int[] arr = { 10, 20, 30, 40 }; // all books stored in an array

		int result = allocateBooks(arr, n, m);
		System.out.println("Allocate minimum number of pages: " + result);

	}

}
