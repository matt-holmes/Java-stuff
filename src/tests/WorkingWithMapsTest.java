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
		assertEquals(" item 1 item 2 item 3 item 4 item 5", 
				this.workingWithMaps.getValuesUsingIterator());
	}
	
	@Test
	public void testGetKeysUsingIterator() {
		assertEquals(" A B C D E", 
				this.workingWithMaps.getKeysUsingIterator());
	}
	
	@Test
	public void testGetItemFromKey() {
		assertEquals("item 1", this.workingWithMaps.getItemFromKey("A"));
		assertEquals("item 2", this.workingWithMaps.getItemFromKey("B"));
		assertEquals("item 3", this.workingWithMaps.getItemFromKey("C"));
		assertEquals("item 4", this.workingWithMaps.getItemFromKey("D"));
		assertEquals("item 5", this.workingWithMaps.getItemFromKey("E"));
	}
	
	@Test 
	public void testGetMyMapSize() {
		assertEquals(5, this.workingWithMaps.getMyMapSize());
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
