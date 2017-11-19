package jan_23;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class ListEx {
	
	@Test
	public void atTest(){
		//Dec List
		
		List<String> myL = new ArrayList<String>();
		
		myL.add("A");
		myL.add("B");
		myL.add("B");
		myL.add("C");
		myL.add("D");
		myL.add("Y");
		myL.add("T");
		myL.add("S");
		
		System.out.println(myL.size());
		
		System.out.println(myL.get(2));
		
		System.out.println(myL);
		
		
	}
}















