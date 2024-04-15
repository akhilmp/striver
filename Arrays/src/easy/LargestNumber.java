package easy;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input= {3,1,5,6,7};
		int[] input1= {3,1,5,6,7};
		/*
		 * 1.brute force approach
		 * Sort the array and return arr[n-1];
		 * TC -- O(n log n)
		 */
		
		Arrays.sort(input);
		System.out.println("Largest Number is "+input[input.length-1]);

		/*
		 *Now optimised approach is
		 *assign large=input[0]
		 *compare with all the elements and return the output
		 *Here TC would be O(n) 
		 */
		
		int large=input1[0];
		
		for(int i=0;i<input1.length;i++)
		{
			if(input1[i]>large)
				large=input1[i];
		}
		System.out.println("Largest Number with optimised approach is "+large);

	}

}
