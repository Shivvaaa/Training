package programs;

import java.util.*;

public class SecondLargest {
	
	static int secondLargest(int[] arr)
	{
		int n=arr.length;
		Arrays.sort(arr);
		for(int i=n-2;i>=0;i--) {
			if(arr[i]!=arr[n-1]) {
				return arr[i];
				
			}
		}return -1;
	}

	public static void main(String args[]) {
		int[] array= {50,50,50,50,50};
		System.out.println(secondLargest(array));
		
	}
}


