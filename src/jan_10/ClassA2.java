package jan_10;

public class ClassA2 {
	
	//Cunst : is a spcl method, which execute automatically when object is created.
	//Rule 1 : It does not having any return type, not even void.
	//Rule 2 : Its name must be same as class name.
	
	public ClassA2(){
		System.out.println("Hello 1");
	}
	
	public void method1(){
		System.out.println("Hello");
	}
	
	public static void main(String arg[]){
		ClassA2 obj = new ClassA2();
		
		obj.method1();
		
		/*String s = "Hello";
		
		System.out.println(s);*/
	}
}
