package week1.Assignment2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int[] data = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(data);
		System.out.println("Second Largest value is " + data[data.length - 2]);

	}

}
