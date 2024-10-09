package StringPrograms;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I'm the string";
		str=str.replace("'", " ");
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);

	}System.out.println(rev);
	if(str.equals(rev)) {
	System.out.println("The string is Palindrom");
}else {
	System.out.println("The string is not a palindrome");
}
	}
}
