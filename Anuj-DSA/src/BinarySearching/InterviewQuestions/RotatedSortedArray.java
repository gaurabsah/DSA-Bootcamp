package BinarySearching.InterviewQuestions;

public class RotatedSortedArray {

	public static int search(int[] nums, int target) {
		int n = nums.length;
		int pivot = getPivot(nums, n);

		if (target >= nums[pivot] && target <= nums[n - 1]) {
			return binarySearch(nums, pivot, n - 1, target);
		} else {
			return binarySearch(nums, 0, pivot - 1, target);
		}

	}

	static int getPivot(int[] arr, int n) {
		int start = 0;
		int end = n - 1;
		int mid = start + (end - start) / 2;

		while (start < end) {
			if (arr[mid] >= arr[0]) {
				start = mid + 1;
			} else {
				end = mid;
			}
			mid = start + (end - start) / 2;
		}

		return start;
	}

	static int binarySearch(int[] arr, int s, int e, int key) {
		int start = s;
		int end = e;
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
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };

		int ans = search(nums, 0);
		System.out.println("Search in Rotated Sorted Array: " + ans);
	}

}
