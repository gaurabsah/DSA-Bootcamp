package Arrays;

import java.util.Arrays;

public class ArrayDeclaration {
	public static void main(String[] args) {
		int[] arr = new int[5];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		System.out.println(arr); // this will give the reference value

//		printing array elements using Arrays Class
		System.out.println("printing array elements using Arrays Class " + Arrays.toString(arr));

//		printing array elements using for loop (iterating)
		for (int i = 0; i < arr.length; i++) {
			System.out.println("printing array elements using for loop (iterating) " + arr[i]);
		}
	}

}
