package jan_23;

public class ClassA1 {

	int i = 10;
	String s = "Hello";
	
	public void method1(){
		System.out.println("Hello");
	}
	
	public void method1(int t){
		System.out.println("t");
		System.out.println(t);
	}
	
	//Method Overloading : It happens in same class
	
	public static void main(String[] args) {

		//new ClassA1().method1();
		
		ClassA1 obj = new ClassA1();
		obj.method1(3);
		
		System.out.println("Original Main");
	}
	
	public static void main(String[] args, int t) {

		//new ClassA1().method1();
		
		ClassA1 obj = new ClassA1();
		obj.method1(3);
		System.out.println("Main");
	}

}
