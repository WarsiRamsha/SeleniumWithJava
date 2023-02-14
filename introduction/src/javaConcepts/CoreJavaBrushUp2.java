package javaConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] sampleArray= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
		//Multiples of 2
		for( int i=0; i<sampleArray.length; i++) {
			
			if (sampleArray[i] % 2 == 0) {
			
				System.out.println(sampleArray[i]);
		}
			else {
				System.out.println(sampleArray[i] + " Not a multiple of true");
			}
			
			//('check if array has any multiple of 2');
		}
		for( int j=0; j<sampleArray.length; j++) {
			
			if (sampleArray[j] % 2 == 0) {
			
				System.out.println(sampleArray[j]);
				break; //skip the further looping
		}
	}
		//array and arraylist dynamic arrays
		
		System.out.println("Array List");
		ArrayList<String> a= new ArrayList<String>(); //arraylist<data type> name with new keyword object is created
		//dynamically add to the list //nor size not the values only type is defined
		//class in java. to access the methods in the class create an object
		
		a.add("This");
		a.add("is");
		a.add("how");
		a.add("how, deleted one");
		a.add("we");
		a.add("add");
		a.add("data using array list");
		a.remove(2);
		System.out.println(a.get(0));
		System.out.println("Array List");
		for(int i=0; i<a.size(); i++) 
		{
			
			System.out.println(a.get(i));
		}
		System.out.println("Enhanced for loop");
		
		for ( String val :a)
		{
			System.out.println(val);
		}
		//Item present in array list

		System.out.println(a.contains("Ramsha"));
		String[] name= {"Normal", "Array", "to", "Array", "List"}; //convert this normal array to arraylist
		List<String> nameArrayList= Arrays.asList(name);
		System.out.println(nameArrayList.contains("List"));
		
		
		
	}
}