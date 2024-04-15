package easy;

public class SecondLargeAndSmall {

	public static void main(String[] args) {
/*
 * Find the second largest and second smallest element from the array.
 */
		int[] a= {1, 2, 3, 4, 5};
		int n=a.length;
        int large=a[0];
        int secondLarge=Integer.MIN_VALUE;
        int smallest=a[0];
        int secondSmall =Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(a[i]>large)
            {
                secondLarge=large;
                large= a[i];
            }
            else if(a[i]>secondLarge)
            {
                secondLarge=a[i];
            }
        }

        for(int i=1;i<n;i++)
        {
            if(a[i]<smallest)
            {
                secondSmall=smallest;
                smallest= a[i];
            }
            else if(a[i]<secondSmall)
            {
                secondSmall=a[i];
            }
        }


System.out.println("Second large is "+secondLarge);
System.out.println("Second small is "+secondSmall);
	}

}
