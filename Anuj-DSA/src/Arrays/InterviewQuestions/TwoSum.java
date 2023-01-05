package Arrays.InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}

			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("no match found!");

	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int target = 9;

		int[] ans = twoSum(arr, target);
		System.out.println("Index of elements: " + Arrays.toString(ans));

//		for (int i = 0; i < ans.length; i++) {
//			int arr1 = ans[i];
//			System.out.println(arr1);
//
//		}

	}

}
