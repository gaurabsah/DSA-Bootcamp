package Arrays.InterviewQuestions;

public class SecondMaximum {

	static int findSecondMax(int[] arr, int n) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}

		return secondMax;

	}

	public static void main(String[] args) {
		int[] arr = { 34, 12, 22, 78, 77, 33 };
		int n = arr.length;

		int ans = findSecondMax(arr, n);
		System.out.println("Second Maximum Element: " + ans);
	}

}
