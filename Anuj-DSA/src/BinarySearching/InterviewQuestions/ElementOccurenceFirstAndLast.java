package BinarySearching.InterviewQuestions;

// https://www.youtube.com/watch?v=zD2Jg3alZV8&list=PLDzeHZWIZsTryvtXdMr6rPh4IDexB5NIA&index=13

public class ElementOccurenceFirstAndLast {

	static int firstOccurenec(int[] arr, int n, int key) {
		int start = 0;
		int end = n - 1;
		int mid = start + (end - start) / 2;
		int ans = -1;

		while (start <= end) {
			if (arr[mid] == key) {
				ans = mid;
				end = mid - 1;
			}

			if (key > arr[mid]) {
				start = mid + 1;
			} else if (key < arr[mid]) {
				end = mid - 1;
			}
			mid = start + (end - start) / 2;
		}
		return ans;
	}

	static int lastOccurenec(int[] arr, int n, int key) {
		int start = 0;
		int end = n - 1;
		int mid = start + (end - start) / 2;
		int ans = -1;

		while (start <= end) {
			if (arr[mid] == key) {
				ans = mid;
				start = mid + 1;
			}

			if (key > arr[mid]) {
				start = mid + 1;
			} else if (key < arr[mid]) {
				end = mid - 1;
			}
			mid = start + (end - start) / 2;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] even = { 1, 2, 3, 3, 3, 3, 3, 3, 3, 5 };

		System.out.println("Element 3 Occurence at First index: " + firstOccurenec(even, even.length, 3));
		System.out.println("Element 3 Occurence at Last index: " + lastOccurenec(even, even.length, 3));
	}

}
