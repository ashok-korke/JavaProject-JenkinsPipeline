package DemoJavaCodeTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import demojavacode.NumCompare;

public class NumCompareTest {
	
	@Test
	@DisplayName("Number comparion tests: First number is greter")
	public void numCompareTest1() {
		NumCompare numcompobj=new NumCompare();
		int rvalue=numcompobj.compare(25, 20);
		Assert.assertEquals(1, rvalue);
		
	}
	
	@Test
	@DisplayName("Number comparion tests: First number is smaller")
	public void numCompareTest2() {
		NumCompare numcompobj=new NumCompare();
		int rvalue=numcompobj.compare(15, 30);
		Assert.assertEquals(-1, rvalue);
		
	}
	@Test
	@DisplayName("Number comparion tests: First number is equal to second")
	public void numCompareTest3() {
		NumCompare numcompobj=new NumCompare();
		int rvalue=numcompobj.compare(55, 55);
		Assert.assertEquals(0, rvalue);
		
	}
}
