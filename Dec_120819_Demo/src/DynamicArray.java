import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
//ArrayList is builtin java function		
		ArrayList myArr = new ArrayList();
//add object e is a build in method
		myArr.add(12);
		myArr.add("Selenium");
		myArr.add(true);
		myArr.add(12.46);
		
		System.out.println(myArr);
		// to print any specific line 
		System.out.println(myArr.get(2));
		
		// to remove an Array
		myArr.remove(1);
		System.out.println(myArr);
		
	}

}
