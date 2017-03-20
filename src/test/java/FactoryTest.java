package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import designpatterns.factory.Factory;
import designpatterns.factory.Footwear;

public class FactoryTest {

	private Factory myFactory;

	@Before
	public void setup() {
		this.myFactory = new Factory();
	}

	@Test
	public void testFactory() {
		Footwear result = null;
		result = this.myFactory.getFootWear("lazy");
		assertEquals("walking", result.action());
		result = this.myFactory.getFootWear("energenic");
		assertEquals("running", result.action());
		result = this.myFactory.getFootWear("motivated");
		assertEquals("hiking", result.action());
		result = this.myFactory.getFootWear("swimming");
	}

}
