package StringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array= {"siva","hema","siva"};
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		int l=array.length;
		for(int i=0;i<l;i++) {
			set.add(array[i]);
		
		
		}System.out.println(set);

	}

}
