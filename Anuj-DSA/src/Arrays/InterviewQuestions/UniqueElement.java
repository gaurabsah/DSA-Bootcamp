package Arrays.InterviewQuestions;

public class UniqueElement {

//	using XOR Concept
	static int findUnique(int[] arr, int n) {
		int ans = 0;

		for (int i = 0; i < n; i++) {
			ans = ans ^ arr[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 1, 3 };
		int n = arr.length;

		int ans = findUnique(arr, n);
		System.out.println("Unique Element: " + ans);
//		returns 4 since 4 occurs only once but 1 and 3 occurs twice.
	}

}
