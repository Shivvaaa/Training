package programs;

public class NumPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=454;
		int temp=num, rev=0;
		while(num>0) {
			rev=(rev*10)+(num%10);
			num=num/10;
			
					
		}System.out.println(rev);
		
		if(rev==temp) {
			System.out.println("The num is palindrome");
		}else {
			System.out.println("The num is not palindrome");
		}
		

	}

}
