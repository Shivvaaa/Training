package StringPrograms;

public class RevPrintTheSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="   Hemas is my love      ";
		char[] input=str.toCharArray();
		char[] result=new char[input.length];
		for(int i=0;i<input.length;i++) {
			if(input[i]==' ') {
				result[i]=' ';
				
			}
		}
		int j=input.length-1;
		for(int i=0;i<input.length;i++) {
			if(input[i]!=' ') {
				if(result[j]==' ') {
					j--;
				}result[j]=input[i];
				j--;
			}
		}
		System.out.println(String.copyValueOf(result));
				
		

}
}
