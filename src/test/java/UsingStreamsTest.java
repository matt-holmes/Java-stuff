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

	@Test
	public void testNamesToUpperCase() {
		UsingStreams inst = new UsingStreams();

		assertEquals("BILL",
				inst.namesToUpperCase().get(0));
		assertEquals("ANNE",
				inst.namesToUpperCase().get(1));
		assertEquals("JON",
				inst.namesToUpperCase().get(2));
		assertEquals("ALEX",
				inst.namesToUpperCase().get(3));
		assertEquals("JANE",
				inst.namesToUpperCase().get(4));
	}

	@Test
	public void testGetSumOfAges() {
		UsingStreams inst = new UsingStreams();

		assertEquals(120,
				inst.getSumOfAges());
	}

	@Test
	public void testGetSortedByName() {
		UsingStreams inst = new UsingStreams();

		assertEquals("Alex",
				inst.getSortedByName().get(0));
		assertEquals("Anne",
				inst.getSortedByName().get(1));
		assertEquals("Bill",
				inst.getSortedByName().get(2));
		assertEquals("Jane",
				inst.getSortedByName().get(3));
		assertEquals("Jon",
				inst.getSortedByName().get(4));
	}

}
