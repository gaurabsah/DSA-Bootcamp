package Arrays.InterviewQuestions;

import java.util.Arrays;

public class ArrayResize {

	static int[] resize(int[] arr, int n, int capacity) {
//		create new array
		int[] temp = new int[capacity];

//		now copy all the element of arr[] to temp[]
		for (int i = 0; i < n; i++) {
			temp[i] = arr[i];
		}

		return temp;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 9, 3, 10 };
		int n = arr.length;
		int capacity = n * 2; // double the array
		int[] result = resize(arr, n, capacity);
		System.out.println(Arrays.toString(result));
		System.out.println(result.length);
	}

}
