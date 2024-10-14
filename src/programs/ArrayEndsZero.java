package programs;

public class ArrayEndsZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {010,20,0,0,0,10};
		int n=arr.length;
		int temp,i;
		int j=0;
		for(i=0;i<n;i++) {
			if(arr[i]!=0 && arr[j]==0) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
		for(i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
