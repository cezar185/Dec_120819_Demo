
public class EHandling {

	public static void main(String[] args) {
/*
 try {		
		int a=5, b=0, c;
		
		c=a/b;
		
		System.out.println(c);
	}
	catch(Exception x) {
		System.out.println("Divide by zero output is "+x);
		

		}
}
}*/
// try catch block allows you to capture the error masg happening within a method  

	try {
		int a[]=new int[5];
		a[1]=20;
		a[4]=30;
		a[10]=25;
	}
	catch(Exception y) {
		System.out.println(y);
	}
}
}