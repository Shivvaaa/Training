package StringPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class Testing {

	public static void main(String[] args) {
		String str ="The value of the string";
		char[] arr=str.toCharArray();
		HashMap<Character,Integer> countTheChar = new HashMap<Character,Integer>();
		for(char c : arr){
		    if(arr.containsKey(c)){
		        countTheChar.put(c,countTheChar.get(c)+1);
		    }else{
		        countTheChar.put(c,1);
		    }
		}
		for(Entry E:countTheChar.entrySet()){
		    System.out.println(E.getkey()+" "+E.getvalue());
		    
		}
	}
}
