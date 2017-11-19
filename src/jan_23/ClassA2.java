package jan_23;

public class ClassA2 {
	
	/*
	 * cunst : is a spcl method/function which execute automatically when object is created.
	 * 
	 * 1. It doesnot having any return type, not even void. 
	 * 2. Its name must be same as class name
	 */
	
	/*public ClassA2(){
		System.out.println("Hello 1");
	}*/
	
	//Type : default, param, copy[x]
	
	public void method1(){
		System.out.println("Hello");
	}

	public static void main(String arg[]){
		ClassA2 obj = new ClassA2();
		
		obj.method1();
	}
}
