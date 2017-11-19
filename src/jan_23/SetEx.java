package jan_23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class SetEx {
	
	@Test
	public void atTest(){
		//Dec List
		//List<String> myL = new ArrayList<String>();
		
		//Dec Set
		Set<String> mySet = new HashSet<String>();
		
		
		mySet.add("A");
		mySet.add("B");
		mySet.add("B");
		mySet.add("C");
		mySet.add("D");
		mySet.add("Y");
		mySet.add("T");
		mySet.add("S");
		
		System.out.println(mySet.size());
		
		//System.out.println(mySet.get); : Note this point
		
		System.out.println(mySet);
		
		/*System.out.println(myL.size());
		
		System.out.println(myL.get(2));
		
		System.out.println(myL);*/
		
		
	}
}















