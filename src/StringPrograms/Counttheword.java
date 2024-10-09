package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class Counttheword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="the java is world wide usage program the java";
		Map<String,Integer> hashmap=new HashMap<String,Integer>();
		String[] arr=str.split(" ");
		for(String word: arr) {
			if(hashmap.containsKey(word))hashmap.put(word, hashmap.get(word)+1);
			else
				hashmap.put(word, 1);
		}
		System.out.println(hashmap);
		}
	
	}


