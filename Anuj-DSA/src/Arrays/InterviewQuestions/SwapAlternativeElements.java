package Arrays.InterviewQuestions;

import java.util.Arrays;

public class SwapAlternativeElements {

	static void swap(int[] arr, int n) {
		for (int i = 0; i < n; i = i + 2) {
			if (i + 1 < n) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 1, 4, 7, 5, 9 };
		int n = arr.length;

		swap(arr, n);
		System.out.println(Arrays.toString(arr));
	}

}
