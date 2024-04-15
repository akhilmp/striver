package easy;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input= {3,1,5,6,7};

		/*
		 * 1.brute force approach
		 * Sort the array and return arr[n-1];
		 * TC -- O(n log n)
		 */
		
		Arrays.sort(input);
		System.out.println("Largest Number is "+input[input.length-1]);
		
	}

}
