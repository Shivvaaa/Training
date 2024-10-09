package StringPrograms;

public class ReversetheSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse the sentence 
//		String str="The value of the string";
//		String[] arr=str.split(" ");
//		String rev=" ";
//		for(int i=arr.length-1;i>=0;i--) {
//			rev=rev+arr[i]+" ";
//		}System.out.println(rev);
		
		//Reverse the sentence and the word
		String str="the value of the string";
		String[] arr=str.split(" ");
		String rev="";
		for(int i=arr.length-1;i>=0;i--) {
			String word=arr[i];
			String revword="";
			for(int j=word.length()-1;j>=0;j--) {
				revword=revword+word.charAt(j);
			}rev=rev+revword+" ";
		}System.out.println(rev);
		
	}

}
