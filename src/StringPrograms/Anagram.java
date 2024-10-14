package StringPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="HemH".toLowerCase();
		String str2="mHeH".toLowerCase();
		if(str1.length()==str2.length()) {
			char[] arr1=str1.toCharArray();
			char[] arr2=str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			boolean result =Arrays.equals(arr1, arr2);
			if(result) {
				System.out.println("The String is anagram");
			}else {
				System.out.println("The String is not anagram");
			}
		}else {
			System.out.println("The String is not anagram");
		}

	}

}
