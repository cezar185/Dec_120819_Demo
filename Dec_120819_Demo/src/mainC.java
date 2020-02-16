//parent class and obj1/method
class methodOverridings {
	
	void show()
	{
		System.out.println("Animal Show");
	}
}

//inherited class
//child class and obj2/method
class child extends methodOverridings{
		void show()
	{
		System.out.println("Animal Child Show");
	}
}
//Driver class
class mainC{
	
	public static void main(String[] args) {
		//MethodOverridings: is a feature that allows a subclass or childclass to provide a specific 
		//implementation of a method that is already used in super/parent class 
//MethodOverridings is referencing to parent object, then parent show() method is called
		methodOverridings obj1 = new methodOverridings();
		child obj2 = new child();
		obj1.show();
//if the MethodOverridings referencing to child object show() is called
		//this is during run time of Polymorphism
		obj2.show();
	}

}
