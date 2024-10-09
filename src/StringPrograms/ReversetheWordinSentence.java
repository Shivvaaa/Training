package StringPrograms;

public class ReversetheWordinSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="The java program";
		String[] arr=str.split(" ");
		String rev="";
		for(int i=0;i<arr.length;i++) {
			String word=arr[i];
			String revword="";
			
			for(int j=word.length()-1;j>=0;j--) {
				revword=revword+word.charAt(j);
				
			}rev=rev+revword+" ";
		}System.out.println(rev);

	}

}
