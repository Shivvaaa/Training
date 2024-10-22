package StringPrograms;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void main(String args[]) {
		int[] arr= {10,10,10,0,0,-1};
		int n=removeDup(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		
        }
	
	public static int removeDup(int[] a) {
		Arrays.sort(a);
		int j=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]!=a[j]) {
			j++;
			a[j]=a[i];
		}
		}return j+1;
			
		}
	}

