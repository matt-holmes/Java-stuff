package tests;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
import datastuctures.UsingStreams;

public class UsingStreamsTest {

	@Test
	public void testGetAdults() {
		UsingStreams inst = new UsingStreams();

		assertEquals(3,
				inst.getAdults().size());
	}

}
