package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import designpatterns.strategy.*;

public class StrategyTest {

	@Test
	public void testStrategyPattern() {
		FontContext fc = new FontContext();
		fc.setFontStrategy(new MonoFontStrategy());
		assertEquals("using a Mono font", fc.useAFont("text"));

		fc.setFontStrategy(new SansFontStrategy());
		assertEquals("using a Sans font", fc.useAFont("text"));

	}

}
