package myPack3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	
	myPack3.TC01.class,
	myPack3.TC03.class,
	myPack3.TC04.class
	
})

public class JunitTestSuite {

}
