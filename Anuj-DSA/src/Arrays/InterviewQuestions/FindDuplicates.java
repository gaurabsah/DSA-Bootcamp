package Arrays.InterviewQuestions;

public class FindDuplicates {

	static int findDuplicateElement(int[] arr, int n) {
		int ans = 0;

		// XOR ing all array elements
		for (int i = 0; i < n; i++) {
			ans = ans ^ arr[i];
		}

		// XOR [1, n-1]
		for (int i = 1; i < n; i++) {
			ans = ans ^ i;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 2, 3 };
		int n = arr.length;

		int ans = findDuplicateElement(arr, n);
		System.out.println("Duplicate elements inside an array: " + ans);
	}

}
