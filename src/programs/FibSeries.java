package programs;

public class FibSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=9;
		int num1=0;
		int num2=1;
		int num3=0;
		System.out.println(num1+" ");
		for(int i=1;i<=fact;i++) {
			num3=num1+num2;
			num2=num1;
			num1=num3;
			System.out.println(num3+" ");
		}
		
		

	}

}
