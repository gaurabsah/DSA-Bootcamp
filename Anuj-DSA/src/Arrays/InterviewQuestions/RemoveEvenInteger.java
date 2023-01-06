package Arrays.InterviewQuestions;

import java.util.Arrays;

public class RemoveEvenInteger {

	static int[] removeEvenInteger(int[] arr, int n) {
		int countOdd = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0) {
				countOdd++;
			}
		}
		int[] result = new int[countOdd];
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0) {
				result[index] = arr[i];
				index++;
			}
		}

		return result;

	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 4, 7, 10, 6, 5 };
		int n = arr.length;

		int[] ans = removeEvenInteger(arr, n);

		System.out.println(Arrays.toString(ans));

	}

}
