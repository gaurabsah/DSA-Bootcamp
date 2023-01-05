package Arrays.InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {

				result[0] = i;

				result[1] = map.get(nums[i]);
			}

			else {

				map.put(target - nums[i], i);
			}
		}
		return result;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int n = arr.length;
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
