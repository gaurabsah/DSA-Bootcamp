package BinarySearching.InterviewQuestions;

public class PivotElement {

	static int getPivot(int[] arr, int n) {
		int start = 0;
		int end = n - 1;
		int mid = start + (end - start) / 2;

		while (start < end) {
			if (arr[mid] >= arr[0]) {
				start = mid + 1;
			} else {
				end = mid;
			}
			mid = start + (end - start) / 2;
		}

		return start;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 8, 10, 17, 1 };

		int ans = getPivot(arr, arr.length);

		System.out.println("Index of Pivot element: " + ans);
	}

}
