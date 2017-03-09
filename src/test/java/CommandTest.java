package tests;

import static org.junit.Assert.*;
import designpatterns.command.*;

import org.junit.Test;

public class CommandTest {

	@Test
	public void testCommand() {
		Remote remote = new Remote();
		TV tv = new TV();
		Command tvOn = new TvOnCommand(tv);
		Command tvOff = new TvOffCommand(tv);

		remote.setCommand(tvOn);
		remote.pressPowerButton();
		assertTrue(tv.getOn());

		remote.setCommand(tvOff);
		remote.pressPowerButton();
		assertFalse(tv.getOn());

	}

}
