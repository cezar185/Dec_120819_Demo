
public class ActionItems {

	public static void main(String[] args) {
		
		Studentinfo obj = new Studentinfo();
		obj.setfirstName("Bob");
		obj.setlastName("Smith");
		obj.setcollageName("BrooklynCollage");
		obj.setstudentID(85213);
		obj.setzipcode(11201);
		
		System.out.println("StudentInfo:"+obj.getfirstName()+" "+obj.getlastName()+" "+obj.getcollageName()+" "+
				obj.getstudentID()+" "+obj.getzipcode());
	
	}
 }
 //Child/Subclass(Constructor)
	class Studentinfo{
				
		private String firstName;
		private String lastName;
		private String collageName;
		private int studentID;
		private int zipcode;
		
		// get methods
		public String getfirstName() {
			return firstName;
		}
		public String getlastName() {
			return lastName;
		}
		public String getcollageName() {
			return collageName;
		}
		public int getstudentID() {
			return studentID;
		}
		public int getzipcode() {
			return zipcode;
		}
		
		
// set methods
			public void setfirstName(String newValue) {
				firstName = newValue;
			}
			public void setlastName(String newValue) {
				lastName = newValue;
			}
			public void setcollageName(String newValue) {
				collageName = newValue;
			}
			public void setstudentID(int newValue) {
				studentID = newValue;
			}
			public void setzipcode(int newValue) {
				zipcode = newValue;
				
			}
	}
			