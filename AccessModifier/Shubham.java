package AccessModifier;

import Inheritance.Swapnil;

public class Shubham  extends Swapnil{
	public static void main(String[] args) {
		Swapnil s = new Shubham();

		s.swapnil();

//		s.swapnil2();    because of Default Access modifier
		Pournima.imDefualt(); // Within same class

		Pournima s1 = new Pournima();
		s1.swapnil();
		
		Shubham s3= new Shubham();
		s3.swapnil2();
	}
}
