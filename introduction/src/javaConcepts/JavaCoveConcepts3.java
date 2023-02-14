package javaConcepts;

public class JavaCoveConcepts3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In java, String is an Object.
		String s1 = "Ramsha Warsi";
		String s2= "Ramsha Warsi";
		
		//not create any other object. Values are same then single object is created. 
		
				//System.out.println(s2);
				//System.out.println("------------------------");
				
			//new 
			String s3 = new String("Ramsha Super Warsi Ramsha");
			String s40 = new String("Ramsha Warsi"); //it will create two new objects even though the values are same
			
			//split
			//To access the methods of string class. object is created
			String[] splittedString = s3.split("Super"); //array 
			//System.out.println(splittedString[0]);
			//System.out.println(splittedString[1].trim());
			//System.out.println(splittedString[2].trim());	 //loop and iterate them one by one
			
			
			
			//Print all elements in an array
			
			System.out.println("++++++++++++++++++");
			String s4 = new String("Ramsha Super Warsi Ramsha");
			for(int i=0; i<s4.length(); i++)
			{
				System.out.println(s4.charAt(i));
			
	}
			System.out.println("Reverse");
			//Print arrays in reverse order famous interview questions
			String s5 = new String("Ramsha Super Warsi Ramsha Warsi");
			for (int j = s5.length()-1;j>=0; j--)
			{
				System.out.println(s5.charAt(j));
			}

}
}
