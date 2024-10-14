package StringPrograms;

public class CountVandC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="Sivakumar";
		String str=string.toLowerCase();
		int vCount=0,cCount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') 
			{
				vCount++;
				
			}else if(
				str.charAt(i)>='a' && str.charAt(i)<='z'){
					cCount++;
				}
			}
		System.out.println("No of vowels of the string  "+vCount);
		System.out.println("No of consonantof the string  "+cCount);
		}

	}


