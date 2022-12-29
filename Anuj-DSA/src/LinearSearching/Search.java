package LinearSearching;

public class Search {

	static int linearSearch(int[] arr, int n, int key) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] even = { 2, 4, 6, 9, 12, 15, 23 };
		int[] odd = { 4, 8, 17, 23, 32, 44, 55 };

		System.out.println("Even Array: " + linearSearch(even, even.length, 23));
		System.out.println("Odd Array: " + linearSearch(odd, odd.length, 80));
	}

}
