package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import datastuctures.WorkingWithMaps;

public class WorkingWithMapsTest {

	private WorkingWithMaps workingWithMaps;

	public WorkingWithMapsTest() {
		this.workingWithMaps = new WorkingWithMaps();
		this.workingWithMaps.addToMap("A", "item 1");
		this.workingWithMaps.addToMap("B", "item 2");
		this.workingWithMaps.addToMap("C", "item 3");
		this.workingWithMaps.addToMap("D", "item 4");
		this.workingWithMaps.addToMap("E", "item 5");
	}
	

	@Test
	public void testGetValuesUsingIterator() {
		assertEquals(this.workingWithMaps.getValuesUsingIterator(), 
				" item 1 item 2 item 3 item 4 item 5");
	}
	
	@Test
	public void testGetKeysUsingIterator() {
		assertEquals(this.workingWithMaps.getKeysUsingIterator(), 
				" A B C D E");
	}
	
	@Test
	public void testGetItemFromKey() {
		assertEquals(this.workingWithMaps.getItemFromKey("A"), 
				"item 1");
		assertEquals(this.workingWithMaps.getItemFromKey("B"), 
				"item 2");
		assertEquals(this.workingWithMaps.getItemFromKey("C"), 
				"item 3");
		assertEquals(this.workingWithMaps.getItemFromKey("D"), 
				"item 4");
		assertEquals(this.workingWithMaps.getItemFromKey("E"), 
				"item 5");
	}
	
	@Test 
	public void testGetMyMapSize() {
		assertEquals(this.workingWithMaps.getMyMapSize(), 
				5);
	}
	
	@Test 
	public void testMyMapContainsValue() {
		assertTrue(this.workingWithMaps.getMyMapContainsValue("item 3"));
	}
	
	@Test 
	public void testMyMapContainsKey() {
		assertTrue(this.workingWithMaps.getMyMapContainsKey("B"));
	}
	
}
