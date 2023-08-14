package DemoJavaCodeTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import demojavacode.NumCompare;

public class NumCompareTest {
	
	@Test
	@DisplayName("Number comparion tests: First number is greter")
	public void numCompareTest() {
		NumCompare numcompobj=new NumCompare();
		int rvalue=numcompobj.compare(25, 20);
		Assert.assertEquals(1, rvalue);
		
	}

}
