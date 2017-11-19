package jan_23;

public class ClassB5 extends ClassA5{
	
	public void method1(){
		System.out.println("ClassB5 : Method1");
		
		//super.method1();
	}
	
	public void method4(){
		System.out.println("ClassB5 : Method4");
	}

	public static void main(String arg[]){
		ClassB5 obj = new ClassB5();
		
		obj.method1();  //Always Base class method will be called
	}
	
}
