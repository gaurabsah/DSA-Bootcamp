package Arrays.Easy;

// time complexity : O(n)

public class MaxMinArray {

	static int getMin(int arr[], int n) {

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}

	static int getMax(int arr[], int n) {

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 12, 8, 10 };
		int n = arr.length;

		int MAX_ELEMENT = getMax(arr, n);
		int MIN_ELEMENT = getMin(arr, n);

		System.out.println("Maximum element: " + MAX_ELEMENT);
		System.out.println("Minimum element: " + MIN_ELEMENT);
	}

}
