package timeComplexity;

public class TimeComplexityDemo {

	static int naturalNumber(int n) {
		return n * (n + 1) / 2;
	}

	static int naturalNumberII(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		double now = System.currentTimeMillis();

		System.out.println(naturalNumber(99999));
		System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " milliseconds");
	}

}
