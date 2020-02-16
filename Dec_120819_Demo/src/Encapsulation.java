//parent class (super class)
 class Encapsulation {

	public static void main(String[] args) {
		
		Encap obj = new Encap();
		obj.setEmpName("ProSmart");
		obj.setEmpAge(25);
		obj.setEmpSSN(123456789);
		System.out.println("Employee Name:"+obj.getEmpName());
		System.out.println("Emplyoee Age:"+obj.getEmpAge());
		System.out.println("Employee SSN:"+obj.getEmpSSN());
	}
 }
 //Child/Subclass(Constructor)
	class Encap{
		// is the process of combining  data and function in to a single unit class.
		// the data is not accessed directly
		//it's accessed through the function present inside the class
		
		private int ssn;
		private String empName;
		private int empAge;
		// get methods
		public int getEmpSSN(){
			return ssn;
		}
		public String getEmpName(){
			return empName;
		}
		public int getEmpAge(){
			return empAge;
		}
// set methods
			public void setEmpName(String newValue) {
				empName = newValue;
			}
			public void setEmpAge(int newValue) {
				empAge = newValue;
						
			}
			public void setEmpSSN(int newValue) {
				ssn = newValue;
				
			}
	}
			
	

