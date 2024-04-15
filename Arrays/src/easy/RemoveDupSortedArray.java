package easy;

public class RemoveDupSortedArray {

	public static void main(String[] args) {
/*
 * remove the duplicates from the array such that each element appears only once.
Return the length of this new array.
 */
		int[] arr= {1,2,2,2,3,3,4};
		int n=arr.length;
		
		 int i=0;

	        for(int j=1; j<n;j++)
	        {
	            if(arr[j]!=arr[j-1])
	            {
	                arr[i+1]=arr[j];
	                i=i+1;
	            }
	        }
	System.out.println("Number of unique elements "+(i+1));
		
		}

}
