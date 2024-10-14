package StringPrograms;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CounttheChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hema";
		char[] arr=str.toCharArray();
		HashMap<Character,Integer> countTheChar =new HashMap<Character,Integer>();
		for (char c :arr) {
			if(countTheChar.containsKey(c)) {
				countTheChar.put(c,countTheChar.get(c)+1);
			}else {
				countTheChar.put(c, 1);
			}
		}
		for(Map.Entry E :countTheChar.entrySet()) {
			System.out.println(E.getKey()+" "+E.getValue());
			
		}
		}
		

	}

