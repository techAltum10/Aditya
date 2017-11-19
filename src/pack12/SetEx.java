package pack12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class SetEx {

	@Test
	public void atTest(){
		
		//Dec
		//List<String> myL = new ArrayList<String>();
		
		Set<String> mySet = new HashSet<String>();
		
		mySet.add("A");
		mySet.add("B");
		mySet.add("C");
		mySet.add("C");
		
		System.out.println(mySet.size());
		
		System.out.println(mySet);
		
		//myL.
		
	}
}
