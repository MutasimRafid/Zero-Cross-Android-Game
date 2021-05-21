package tester;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import runner.Controller;

public class ControllerTest {
	Controller c;

	@Before
	public void setUp() throws Exception {
		c = new Controller();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(false,c.onClickFind());
		assertEquals(2,c.controlPlayer());
	}

}
