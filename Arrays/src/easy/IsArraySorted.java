package easy;

public class IsArraySorted {

	public static void main(String[] args) {
/*
 * check whether the given array is sorted in the non-decreasing order or not.
 *  Your task is to return 1 if the given array is sorted. Else, return 0.
 */
		int[] a= {1, 2, 3, 4, 5};
		int n=a.length;
		boolean isSorted=true;
		
		 for(int i=1;i<n;i++)
	        {
	            if(a[i]<a[i-1])
	            {
	           isSorted= false;
	            }

	         }
		 System.out.println("Array is Sorted "+isSorted);

	}

}
