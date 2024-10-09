package StringPrograms;

import java.util.HashMap;
import java.util.Set;

public class CounttheRepeatedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java is Java String man";
		String[] arr=str.split(" ");
		HashMap<String,Integer> WordCount=new HashMap<String, Integer>();
		for(String word : arr ) {
			if(WordCount.containsKey(word.toLowerCase())) {
				WordCount.put(word, WordCount.get(word.toLowerCase()+1));
			}else {
				WordCount.put(word.toLowerCase(), 1);
			}
		}//System.out.println(WordCount);
		
		Set<String> wordsin = WordCount.keySet();
		for(String word : wordsin) {
			if(WordCount.get(word) > 1) {
				System.out.println(word+" "+WordCount.get(word));
			}
		}
		
		}
}
