package StringPrograms;

public class DisplayInteger {
	
	static void extractInt(String sen) {
		String[] splitwords=sen.split("[a-zA-z]");
	
		
		for(String i:splitwords) {
			sen.replace(',', ' ');
			System.out.println(i+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String senten ="The order number 87687 , is 89 is place 9876544324";
		senten=senten.replace(',', ' ');
		extractInt(senten);

	}

}
