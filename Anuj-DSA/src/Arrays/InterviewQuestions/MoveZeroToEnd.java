package Arrays.InterviewQuestions;

import java.util.Arrays;

public class MoveZeroToEnd {

	public static void moveZeroes(int[] nums) {
		if (nums == null || nums.length == 0) {
			return;
		}
		int j = 0; // j-- focus on 0th element only
		for (int i = 0; i < nums.length; i++) { // i-- focus on non-zero element
			if (nums[i] != 0 && nums[j] == 0) {
				// swap
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
			if (nums[j] != 0) {
				j++;
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };

		moveZeroes(arr);
		System.out.println(Arrays.toString(arr));
	}

}
