package com.gaurab.twoDArray;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1 2 3   
 * 4 5 6   
 * 7 8 9   
 * 
 * arr[0]= {1,2,3}
 * arr[1]= {4,5,6}
 * arr[2]= {7,8,9}
 * 
 * 
 * arr[0][0]=1
 * arr[0][1]=2
 * arr[0][2]=3 and so on...
 */
public class TwoDArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] arr = new int[3][3];

		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				arr[row][column] = scn.nextInt();
			}
		}

		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				System.out.print(arr[row][column] + " ");
			}
			System.out.println();
		}
		
		/*
		 * another way to print the output 
		 */

		for (int row = 0; row < arr.length; row++) {
			System.out.println(Arrays.toString(arr[row]));
		}
	}

}
