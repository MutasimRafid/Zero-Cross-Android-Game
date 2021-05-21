package tester;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import runner.Model;

public class ModelTest {
	Model m;

	@Before
	public void setUp() throws Exception {
		m = new Model();
		
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(1,m.callme());
		assertEquals(false,m.callme2());
	}

	

}
