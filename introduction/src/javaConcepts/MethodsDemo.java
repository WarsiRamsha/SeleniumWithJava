package javaConcepts;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo first = new MethodsDemo();
		String Data = first.getData();
		System.out.println(Data);
		
	}
	//why method. to reuse it every time. method in class create it outside the main. it might or mightnot run
	
	public String getData() {
		 //public any class can use it
		//void what to return
		System.out.println("Hello World!");
		return "Ramsha Warsi";
		
	}

}
