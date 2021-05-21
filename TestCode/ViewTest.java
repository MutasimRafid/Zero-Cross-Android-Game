package tester;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import runner.View;

public class ViewTest {
	View v;

	@Before
	public void setUp() throws Exception {
		v = new View();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(true,v.getResources());
		assertEquals(true,v.viewSend());
		
	}

}
