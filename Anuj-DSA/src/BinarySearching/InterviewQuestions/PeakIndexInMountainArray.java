package BinarySearching.InterviewQuestions;

public class PeakIndexInMountainArray {

	public static int peakIndexInMountain(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int mid = start + (end - start) / 2;

		while (start < end) {
			if (arr[mid] < arr[mid + 1]) {
				start = mid + 1;
			} else {
				end = mid;
			}
			mid = start + (end - start) / 2;
		}
		return start;

	}

	public static void main(String[] args) {
		int[] arr = { 0, 10, 50, 2 };

		System.out.println("Index of Peak Element in Mountain: " + peakIndexInMountain(arr));

	}

}
