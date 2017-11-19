package jan_23;

public class ClassA4 {

	public void method1(){
	
		try{
			int t = 2/0;
		}
		
		catch(Exception e){
			System.out.println("Can not divide by zero.");
		}
	}
	
	public static void main(String arg[]){
		ClassA4 obj = new ClassA4();
		
		obj.method1();
	}
}
