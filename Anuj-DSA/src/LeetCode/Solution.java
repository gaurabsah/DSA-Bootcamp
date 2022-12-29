package LeetCode;

class Solution {
	public int[] searchRange(int[] nums, int target) {

		int[] arr = new int[2];

		arr[0] = firstOccurenec(nums, target);
		arr[1] = lastOccurenec(nums, target);

		return arr;

	}

	int firstOccurenec(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;
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

	int lastOccurenec(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;
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

}
