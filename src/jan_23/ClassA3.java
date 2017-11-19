package jan_23;

public class ClassA3 {     
    int a = 10;
    
    public void doStuff(int a) {
        //a += 1;
    	
    	a = a+ 1;
        System.out.println(a++);
    }
    
    public static void main(String args[]) {
        ClassA3 t = new ClassA3();
        t.doStuff(3);
    }
}
