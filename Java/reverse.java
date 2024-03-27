package superclass;

public class reverse {

	public static void main(String[] args) {
		String name="roshan";
		reversestring(name);


	}

	public static void reversestring(String name) {
		int length = name.length();
		if(name.length()==0) {
			System.out.println(name);
		}
		else {
			
			char revname = name.charAt(length-1);
			System.out.print(revname);
			 reversestring(name.substring(0,length-1));
		}
		
		
	}
	

}

