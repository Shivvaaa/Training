package programs;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,10,20,30,10};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		int l=array.length;
		for(int i=0;i<l;i++) {
			set.add(array[i]);
		}System.out.println(set);

	}

}
