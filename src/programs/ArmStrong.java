package programs;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		
		int n,num,sum=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		num=n;
		while(num>0) {
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}if(n==sum) {
			System.out.println("The num is Armstrong");
		}else {
			System.out.println("The num is not Armstrong");
		}
		}
		
		

}

