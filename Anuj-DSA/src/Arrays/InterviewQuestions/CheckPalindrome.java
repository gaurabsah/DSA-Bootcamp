package Arrays.InterviewQuestions;

public class CheckPalindrome {

	static boolean isPalindrome(String word) {
		char[] charArray = word.toCharArray();
		int start = 0;
		int end = charArray.length - 1;
		while (start < end) {
			if (charArray[start] != charArray[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		String word = "madam";
		boolean ans = isPalindrome(word);
		System.out.println(ans);
	}

}
