package BinarySearching;

// Link: https://www.youtube.com/watch?v=YJeoQBevNVo&list=PLDzeHZWIZsTryvtXdMr6rPh4IDexB5NIA&index=12

public class Search {

	static int binarySearch(int[] arr, int n, int key) {
		int start = 0;
		int end = n - 1;
		int mid = start + (end - start) / 2;

		while (start <= end) {
			if (arr[mid] == key) {
				return mid;
			}

			if (key > arr[mid]) {
				start = mid + 1;
			} else if (key < arr[mid]) {
				end = mid - 1;
			}
			mid = start + (end - start) / 2;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] even = { 2, 4, 6, 9, 12, 15, 23 };
		int[] odd = { 4, 8, 17, 23, 32, 44, 55 };

		System.out.println("Even Array: " + binarySearch(even, even.length, 2));
		System.out.println("Odd Array: " + binarySearch(odd, odd.length, 8));

	}

}
