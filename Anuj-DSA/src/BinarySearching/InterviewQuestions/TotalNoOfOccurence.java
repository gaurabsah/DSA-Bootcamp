package BinarySearching.InterviewQuestions;

public class TotalNoOfOccurence {

	static int totalNumberOfOccurence(int[] arr, int n, int key) {
		int a = (lastOccurenec(arr, n, key) - firstOccurenec(arr, n, key)) + 1;
		return a;
	}

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
		System.out.println("Total number of occurence of 3 is: " + totalNumberOfOccurence(even, even.length, 3));
	}

}
