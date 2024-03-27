package superclass;

public class Anagram {

	public static void main(String[] args) {
		String s1="software";
		String s2="swea hoft";
		int k=0;
		
		for(int i=0;i<s1.length();i++) {
			k=0;
			for(int j=0;j<s2.length();j++) {
				
				if(s2.charAt(i)==' ') {
					k=1;
				}
				else if(s1.charAt(i)==s2.charAt(j)) {
					k=1;
					break;
					
				}
				
			}
			if(k==0) {
				System.out.println("not a anagram");
				break;
			}
			
		}
		if(k==1) {
			System.out.println("anagram");
		}
		

	}

}
