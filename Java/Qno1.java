package dayseven;

import java.util.Vector;

public class Qno1 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1=new Integer(50);
		Integer i2=new Integer(20);
		try {
		System.out.println(Arithmetic.Sub(i1, i2));
		System.out.println(Arithmetic.Div(i1, i2));
		}
		catch(ArithmeticException q) {
			System.out.println(q);
		}
		
//		Vector<Number> v=new Vector<>();
//		v.add(new Integer(20));
//		v.add(new Integer(30));
//	
//		System.out.println(Arithmetic.Sub(v));
		
		
 
	}
 
}
 
