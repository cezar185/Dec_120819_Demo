
public class Overloading {

	public static void main(String[] args) {
		// is a process of specifying multiple methods under a class.
		//allows different methods to have same name but different signature.
		//Ex: number of parameters, type of parameters, method name, order parameters,
		// Parameters: is a arguments value that passed into a function

		System.out.println(add(1, 50));
		System.out.println(add(5.354, 40.25));
		System.out.println(add("Java", "Selenium"));
		
	}
		public static int add(int a, int b) {
			return(a+b);
		}
		public static double add(double a, double b) {
			return(a+b);
		}
		public static String add(String a, String b) {
			return(a+b);
			
		}
}
