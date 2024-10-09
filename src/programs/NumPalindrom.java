package programs;

public class NumPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=454;
		int temp=num, rev=0,rem;
		while(num>0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			
					
		}System.out.println(rev);
		
		if(rev==temp) {
			System.out.println("The num is palindrome");
		}else {
			System.out.println("The num is not palindrome");
		}
		

	}

}
