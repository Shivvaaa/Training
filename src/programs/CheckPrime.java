package programs;

public class CheckPrime {

	public static void main(String[] args) {
		
		int num=20;
		System.out.println(isPrime(num));
				
		
		
	}
	static boolean isPrime(int n) {
		if(n==0)return false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
