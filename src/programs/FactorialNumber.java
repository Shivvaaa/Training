package programs;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		System.out.println("The factorial of " + num +" value is "+ factorial(num));
		

	}
	
	static int factorial(int n) {
		int res=1;
		for(int i=2;i<=n;i++) {
			res =res*i;

		}
		return res;
		
	}

}
