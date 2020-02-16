// just a class to get the return type value
public class Polymorp {

	public static void main(String[] args) {
		// has the ability of an object to take many form
		// it actually occurs when a parent class refers to a child/sub class
		//child/sub class of a class can define their own unique behavior and share functionality of parent class
		// there are 2 types of Polymorphism: static and dynamic
		//Inheritance, Method Overloading. Overriding comes into Polymorphism concept
		
		PolyBank bank_2 = new PolyBank_2();
		PolyBank bank_3 = new PolyBank_3();
		
		System.out.println(bank_2.Interestrate());
		System.out.println(bank_3.Interestrate());
	}

}
