package Arrays.InterviewQuestions;

import java.util.Arrays;

public class ReverseArrayUsingPointers {

	static void reverse(int[] arr, int n) {
		int start = 0;
		int end = n - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 9, 5, 12, 10 };
		int n = arr.length;
		reverse(arr, n);
		System.out.println(Arrays.toString(arr));

	}

}
