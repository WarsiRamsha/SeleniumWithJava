package javaConcepts;

public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Varriables and Data types
		//main block of code. Whatever we will write here will execute
		
		int num=5; //integers
		System.out.println(num);
		String learningJava = "Learning java is bit tough but once you go then it becomes easy"; //strings
		System.out.println(learningJava);
		Double decimal=3.14; //double float has small range whereas double has wide range
		System.out.println(decimal);
		char FirstAlphabet = 'R'; //single character within quotes
		System.out.println(FirstAlphabet);
		//	Boolean True or false
		Boolean Iscontented = true;
		System.out.println(Iscontented);
		System.out.println(learningJava   +  "  Believe you me!");
		
		//Arrays
		
		//I will first initialize an array. Two ways.
		//Way 01
		char[] characters = new char[6]; //new will aloocate memory and length of array 
				characters [0] = 'R'; //Assignment
				characters [1] = 'A';
				characters [2] = 'M';
				characters [3] = 'S';
				characters [4] = 'H';
				characters [5] = 'A';
		
				
		//initialize arrays 2 way
		int[] arr2 = {10,11,12,13,14,15,16};
		
		//Access any item
		System.out.println(arr2[3]); //starting from zero
		System.out.println(arr2.length); //So that array length can be find out
		System.out.println("Loops");
		//Loops 
		for(int i=0; i<characters.length; i++) //syntax
		{
			System.out.println(characters[i]);
		}
		for(int j=0; j<arr2.length; j++)
		{
			System.out.println(arr2[j]);
		}
		System.out.println("Enhanced for loop 1");
		for(int x:arr2) {
			System.out.println(x);
		}
		System.out.println("Enhanced for loop 2");
		for(char c:characters) {
			System.out.println(c);
		}
		}
	}
