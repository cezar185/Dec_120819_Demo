
public class ChildClass extends BaseClass{

	public static void main(String[] args) {
	
		 	ChildClass obj1= new ChildClass();
		  	obj1.calCarEMI();
		 	obj1.calcHomeEMI();
		 	obj1.calculateHOA();
		 	obj1.offerService();
		 	
	}
	public void calcHomeEMI()
	{
		System.out.println("your EMI is 50K");
	}
	public void calCarEMI()
	{
		System.out.println("your EMI is 25K");
	}
}
