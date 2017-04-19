package tests;

import static org.junit.Assert.*;
import designpatterns.decorator.*;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void test() {
		Icecream icecream = new MintIcecream(new ChocolateChipIcecream(new SimpleIcecream()));
	    assertEquals("base icecream + chocolate chip + mint", icecream.makeIcecream());
	}

}
