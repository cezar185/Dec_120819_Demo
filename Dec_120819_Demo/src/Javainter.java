interface Persons{
	public void subject();
	void studentName();
}
public class Javainter implements Persons {
		// Interface is a reference type in Java which is similar to Class
		//it will contain abstract methods.
		//A Class will be implemented an interface
		
		// interface person
		//public void Subject();
		//public void studentName();
		public void subject() {
			System.out.println("This is Math Class");
		}
		public void studentName() {
			System.out.println("John");
		}
		public static void main(String[] args) {
			Javainter e = new Javainter();
			e.studentName();
			e.subject();
		}
		

	}
