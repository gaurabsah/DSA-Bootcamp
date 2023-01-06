package Arrays.InterviewQuestions;

public class MissingNumber {

	static int findMissingNumber(int[] arr, int n) {
		int range = n + 1;
		int sum = range * (range + 1) / 2;
		int sumOfAllElements = 0;
		for (int i = 0; i < n; i++) {
			sumOfAllElements = sumOfAllElements + arr[i];
		}
		int missingNumber = sum - sumOfAllElements;
		return missingNumber;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 6, 5 };
		int n = arr.length;
		int ans = findMissingNumber(arr, n);
		System.out.println("Missing Number: " + ans);
	}

}
