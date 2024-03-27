package superclass;
import java.util.*;

import java.util.Scanner;

public class vowels{
	  public static void main(String[] args){
		  String name="sairoshan";
		  
		  int length=name.length();
		  int i=0;
		  int vowel=0;
		  int consonent=0;
		  
		  while(i<=length-1) {
			  
			  if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
				  vowel++;
			  }
			  else {
				  consonent++;
			  }
			  i++;
			  
		  }
		  System.out.println("vowel count:"+vowel);
		  System.out.println("consonent count:"+consonent);
		  
		  
		  
		  


	 
			
		}
	 
	
	  
}
	  
	    