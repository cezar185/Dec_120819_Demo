
public class ArraySession {

	public static void main(String[] args) {
		// Array: store multiple value in single variables
		//Limitation: sizing & type of data issue 
		//(Note: if you use dynamic array these limitition can be overcome)
		
//1. Declare the Array (int[] array
//2. intialize the array and set it's size (array = new array[3])
		
	/*	String [] names=new String[4];
				
				names[0]="Selenium";
				names[1]="Java";
				names[2]="Auto";
				names[3]="12.56";
				
				System.out.println(names[0]);
				System.out.println(names[2]);
		*/		
/*		int [] names=new int[4];
 				
				names[0]=123;
				names[1]=5287;
				names[2]=3157;
				names[3]=213564;
			
				//System.out.println(names[0]);
				//System.out.println(names[2]);
				
				// print all together 
				
				for(int i=0;i<names.length; i++)
				{
					System.out.println(names[i]);
				}
	*/
		
			int [] names=new int[4];
				
				names[0]=123;
				names[1]=248;
				names[2]=579;
				names[3]=987;
				
				//more simple way= another type of loop
				// str is a variable name- you can put anything
				for (int str : names)
				{
					System.out.println(str);
				}
		
	}

}
