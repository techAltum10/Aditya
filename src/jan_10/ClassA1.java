package jan_10;

public class ClassA1 {
	
	int i = 10;
	String s = "abc";
	
	public void method1(){
		System.out.println("Hello");
	}
	
	/*
	 * When two or more methods having same name then this is known as 'Method Overloading'
	 * and it happens in same class.
	 * 
	 */
	
	public void method1(int t){
		
		//System.out.println(t);
		System.out.println("Hello 1");
	}
	
	public void method1(int t, String s){
		System.out.println("Hello 1");
	}
	
	public static void main(String arg[]){
		ClassA1 obj = new ClassA1();
		
		obj.method1(2);
		
		System.out.println("Main");
	}
	
	public static void main(String arg[], int t){
		ClassA1 obj = new ClassA1();
		
		obj.method1(2);
		
		System.out.println("Main 1");
	}
}
