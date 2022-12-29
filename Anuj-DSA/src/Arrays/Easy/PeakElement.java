package Arrays.Easy;

/*
 * Link: https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/
 * Find a peak element which is not smaller than its neighbours
 * 
 * Input: array[]= {5, 10, 20, 15}
   Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 or 90
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.
 */

public class PeakElement {

//	Linear O(n)

	static int findPeak(int[] arr, int n) {

		if (n == 1) {
			return 0;
		}

		if (arr[0] >= arr[1]) {
			return 0;
		}

		if (arr[n - 1] >= arr[n - 2]) {
			return n - 1;
		}

		// Check for every other element
		for (int i = 1; i < n - 1; i++) {
			// Check if the neighbors are smaller
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
				return i;
			}

		}
		return 0;
	}

//	Binary Search O(log n)
	static int findPeak1(int arr[], int n) {
		int l = 0;
		int r = n - 1;
		int mid = 0;

		while (l <= r) {

			// finding mid by binary right shifting.
			mid = (l + r) >> 1;

			// first case if mid is the answer
			if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
				break;

			// move the right pointer
			if (mid > 0 && arr[mid - 1] > arr[mid])
				r = mid - 1;

			// move the left pointer
			else
				l = mid + 1;
		}

		return mid;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 10, 20, 15 };
		int n = arr.length;
		System.out.println("Linear Search: Index of a peak point is " + findPeak(arr, n));
		System.out.println("-------------------------------");
		
		System.out.print("Binary Search: Index of a peak point is " + findPeak1(arr, n));
	}

}
