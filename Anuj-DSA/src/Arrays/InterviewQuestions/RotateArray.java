package Arrays.InterviewQuestions;

import java.util.Arrays;

//Link: https://www.youtube.com/watch?v=8RErc0VXAo8

public class RotateArray {

	static void reverse(String[] arr, int start, int end) {
		while (start < end) {
			String temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	static void rotate(String[] arr, int n, int k) {
		k = k % n;
		if (k < 0) {
			k = k + n;
		}
//		first part
		reverse(arr, 0, n - k - 1);

//		second part
		reverse(arr, n - k, n - 1);

//		all
		reverse(arr, 0, n - 1);
	}

	public static void main(String[] args) {
		String[] arr = { "a", "b", "c", "d", "e", "f", "g", "h" };
		int n = arr.length;
		int k = 3; // rotate

		rotate(arr, n, k);
		System.out.println(Arrays.toString(arr)); // f,g,h,a,b,c,d,e

	}

}
